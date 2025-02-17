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
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
            Workbook workbook1 = new XSSFWorkbook(excellFile1);
            Workbook workbook2 = new XSSFWorkbook(excellFile2);

            // Get first/desired sheet from the workbook
            Sheet sheet1 = workbook1.getSheetAt(0);
            Sheet sheet2 = workbook2.getSheetAt(0);

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

    public static void addSheet(Sheet mergedSheet, Sheet sheet) {
        // map for cell styles
        Map<Integer, CellStyle> styleMap = new HashMap<Integer, CellStyle>();
        
        // This parameter is for appending sheet rows to mergedSheet in the end
        int len = mergedSheet.getLastRowNum();
        for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

            Row row = sheet.getRow(j);
            Row mrow = mergedSheet.createRow(len + j + 1);

            for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                Cell cell = row.getCell(k);
                Cell mcell = mrow.createCell(k);

                if (cell.getSheet().getWorkbook() == mcell.getSheet()
                        .getWorkbook()) {
                    mcell.setCellStyle(cell.getCellStyle());
                } else {
                    int stHashCode = cell.getCellStyle().hashCode();
                    CellStyle newCellStyle = styleMap.get(stHashCode);
                    if (newCellStyle == null) {
                        newCellStyle = mcell.getSheet().getWorkbook()
                                .createCellStyle();
                        newCellStyle.cloneStyleFrom(cell.getCellStyle());
                        styleMap.put(stHashCode, newCellStyle);
                    }
                    mcell.setCellStyle(newCellStyle);
                }

                switch (cell.getCellType()) {
                case FORMULA:
                    mcell.setCellFormula(cell.getCellFormula());
                    break;
                case NUMERIC:
                    mcell.setCellValue(cell.getNumericCellValue());
                    break;
                case STRING:
                    mcell.setCellValue(cell.getStringCellValue());
                    break;
                case BLANK:
                    mcell.setBlank();
                    break;
                case BOOLEAN:
                    mcell.setCellValue(cell.getBooleanCellValue());
                    break;
                case ERROR:
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