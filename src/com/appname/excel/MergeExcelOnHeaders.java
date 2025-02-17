package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
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

public class MergeExcelOnHeaders {

    public static void main(String[] args) {
        try {
            // get input excel files
            FileInputStream excellFile1 = new FileInputStream(new File(
                    "C:\\inputExcel1.xlsx"));
            FileInputStream excellFile2 = new FileInputStream(new File(
                    "C:\\inputExcel2.xlsx"));

            // Create Workbook instance holding reference to .xlsx file
            Workbook workbook1 = new XSSFWorkbook(excellFile1);
            Workbook workbook2 = new XSSFWorkbook(excellFile2);

            // Get first/desired sheet from the workbook
            Sheet mainSheet = workbook1.getSheetAt(0);
            Sheet sheet2 = workbook2.getSheetAt(0);

            // add sheet2 to mainSheet
            addSheet(mainSheet, sheet2, mapHeaders(sheet2, mainSheet));
            excellFile1.close();
            excellFile2.close();
            
            // save merged file
            File mergedFile = new File("C:\\merged.xlsx");
            if (!mergedFile.exists()) {
                mergedFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(mergedFile);
            workbook1.write(out);
            out.close();
            System.out.println("Files were merged succussfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addSheet(Sheet mainSheet, Sheet sheet, HashMap<Integer, Integer> map) {
        
        //get column number
        Set<Integer> colNumbs = map.keySet();
        // map for cell styles
        Map<Integer, CellStyle> styleMap = new HashMap<Integer, CellStyle>();

        // This parameter is for appending sheet rows to mergedSheet in the end
        int len = mainSheet.getLastRowNum();
        for (int j = sheet.getFirstRowNum() + 1 ; j <= sheet.getLastRowNum(); j++) {

           Row row = sheet.getRow(j);
            
            // Create row in main sheet
            Row mrow = mainSheet.createRow(len + j);

            for (Integer k : colNumbs) {
                Cell cell = row.getCell(k.intValue());
                
                // Create column in main sheet
                Cell mcell = mrow.createCell(map.get(k).intValue());

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

                // set value based on cell type
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

    // results MAP of <secondary sheet, main sheet>
    public static HashMap<Integer, Integer> mapHeaders(Sheet sheet1,
           Sheet sheet2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Row row1 = sheet1.getRow(0);
        Row row2 = sheet2.getRow(0);
        for (int i = row1.getFirstCellNum(); i < row1.getLastCellNum(); i++) {
            for (int j = row2.getFirstCellNum(); j < row2.getLastCellNum(); j++) {
                if (row1.getCell(i).getStringCellValue()
                        .equals(row2.getCell(j).getStringCellValue())) {
                    map.put(new Integer(i), new Integer(j));
                }
            }
        }
        return map;
    }
}