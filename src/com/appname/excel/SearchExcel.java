 package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SearchExcel {
    public static void main(String[] args) {
        try {
            // excel files
            FileInputStream excellFile = new FileInputStream(new File(
                    "C:\\excel1.xlsx"));
            
            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(excellFile);
            
            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            
            // add sheet2 to sheet1
            ArrayList<Row> rows = searchSheet("Srinivas", sheet);
            System.out.println("filtered rows : \n"+rows);
            excellFile.close();

            System.out
                    .println("Files were searched successfulyy ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
    public static ArrayList<Row> searchSheet(String searchText, XSSFSheet sheet) {
        // This parameter is for appending sheet rows to mergedSheet in the end
        
        Double doubleValue = null;
        Boolean booleanValue = null;
        ArrayList<Row> filteredRows = new ArrayList<Row>();

        //Get double value if searchText is double
        try {
            doubleValue = Double.parseDouble(searchText);
        } catch(Exception e) {  
        }
        
        //Get boolean value if searchText is boolean
        try {
            booleanValue = Boolean.parseBoolean(searchText);
        } catch(Exception e) {  
        }
        
        //Iterate rows
        for (int j = sheet.getFirstRowNum(); j <= sheet.getLastRowNum(); j++) {

            XSSFRow row = sheet.getRow(j);
           
            //Iterate columns
            for (int k = row.getFirstCellNum(); k < row.getLastCellNum(); k++) {
                XSSFCell cell = row.getCell(k);
            
               //Search value based on cell type
               switch (cell.getCellType()) {
                case HSSFCell.CELL_TYPE_NUMERIC:
                    if(doubleValue != null && doubleValue.doubleValue() == cell.getNumericCellValue()) {
                        filteredRows.add(row);
                    }
                    break;
                case HSSFCell.CELL_TYPE_STRING:
                    if(searchText != null && searchText.equals(cell.getStringCellValue())) {
                        filteredRows.add(row);
                    }
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    if(booleanValue != null && booleanValue.booleanValue() == cell.getBooleanCellValue()) {
                        filteredRows.add(row);
                    }
                    break;
                default:
                    if(searchText != null && searchText.equals(cell.getStringCellValue())) {
                        filteredRows.add(row);
                    }
                    break;
                }
            }
        }
        return filteredRows;
    }

}