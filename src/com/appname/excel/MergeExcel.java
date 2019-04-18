package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MergeExcel {

    public static void main(String[] args) {
        try {
            // excel files
            FileInputStream excellFile1 = new FileInputStream(new File(
                    "C:\\excel1.xlsx"));
            FileInputStream excellFile2 = new FileInputStream(new File(
                    "C:\\excel2.xlsx"));

            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);

            // Get first/desired sheet from the workbook
            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);

            // add sheet2 to sheet1
            addSheet(sheet1, sheet2);
            excellFile1.close();

            // save merged file
            File mergedFile = new File(
                    "C:\\merged.xlsx");
            if (!mergedFile.exists()) {
                mergedFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(mergedFile);
            workbook1.write(out);
            out.close();
            System.out
                    .println("Files were merged succussfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addSheet(XSSFSheet mergedSheet, XSSFSheet sheet) {
        // map for cell styles
        Map<Integer, XSSFCellStyle> styleMap = new HashMap<Integer, XSSFCellStyle>();
        
        // This parameter is for appending sheet rows to mergedSheet in the end
        int len = mergedSheet.getLastRowNum();
        for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

            XSSFRow row = sheet.getRow(j);
            XSSFRow mrow = mergedSheet.createRow(len + j + 1);

            for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                XSSFCell cell = row.getCell(k);
                XSSFCell mcell = mrow.createCell(k);

                if (cell.getSheet().getWorkbook() == mcell.getSheet()
                        .getWorkbook()) {
                    mcell.setCellStyle(cell.getCellStyle());
                } else {
                    int stHashCode = cell.getCellStyle().hashCode();
                    XSSFCellStyle newCellStyle = styleMap.get(stHashCode);
                    if (newCellStyle == null) {
                        newCellStyle = mcell.getSheet().getWorkbook()
                                .createCellStyle();
                        newCellStyle.cloneStyleFrom(cell.getCellStyle());
                        styleMap.put(stHashCode, newCellStyle);
                    }
                    mcell.setCellStyle(newCellStyle);
                }

                switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_FORMULA:
                    mcell.setCellFormula(cell.getCellFormula());
                    break;
                case HSSFCell.CELL_TYPE_NUMERIC:
                    mcell.setCellValue(cell.getNumericCellValue());
                    break;
                case HSSFCell.CELL_TYPE_STRING:
                    mcell.setCellValue(cell.getStringCellValue());
                    break;
                case HSSFCell.CELL_TYPE_BLANK:
                    mcell.setCellType(HSSFCell.CELL_TYPE_BLANK);
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    mcell.setCellValue(cell.getBooleanCellValue());
                    break;
                case HSSFCell.CELL_TYPE_ERROR:
                    mcell.setCellErrorValue(cell.getErrorCellValue());
                    break;
                default:
                    mcell.setCellValue(cell.getStringCellValue());
                    break;
                }
            }
        }
    }
}