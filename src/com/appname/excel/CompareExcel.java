package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CompareExcel {

    public static void main(String[] args) {
        try {
            // get input excel files
        	System.out.println("System User dir"+System.getProperty("user.dir"));
            FileInputStream excellFile1 = new FileInputStream(new File(
                    System.getProperty("user.dir")+"\\src\\com\\resources\\created.xlsx"));
            FileInputStream excellFile2 = new FileInputStream(new File(
                    System.getProperty("user.dir")+"\\src\\com\\resources\\created2.xlsx"));

            System.out.println("Sheets Loaded Successfully");
            // Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);

            System.out.println("Sheets Loaded Successfully");
            
            // Get first/desired sheet from the workbook
            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);
            // Compare sheets
            if(compareTwoSheets(sheet1, sheet2)) {
                System.out.println("\n\nThe two excel sheets are Equal");
            } else {
                System.out.println("\n\nThe two excel sheets are Not Equal");
            }
            
            //close files
            excellFile1.close();
            excellFile2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
    // Compare Two Sheets
    public static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
        int firstRow1 = sheet1.getFirstRowNum();
        int lastRow1 = sheet1.getLastRowNum();
        boolean equalSheets = true;
        for(int i=firstRow1; i <= lastRow1; i++) {
            
            System.out.println("\n\nComparing Row "+i);
            
            XSSFRow row1 = sheet1.getRow(i);
            XSSFRow row2 = sheet2.getRow(i);
            if(!compareTwoRows(row1, row2)) {
                equalSheets = false;
                System.out.println("Row "+i+" - Not Equal");
                break;
            } else {
                System.out.println("Row "+i+" - Equal");
            }
        }
        return equalSheets;
    }

    // Compare Two Rows
    public static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
        if((row1 == null) && (row2 == null)) {
            return true;
        } else if((row1 == null) || (row2 == null)) {
            return false;
        }
        
        int firstCell1 = row1.getFirstCellNum();
        System.out.println("First Cell Number:"+firstCell1);
        int lastCell1 = row1.getLastCellNum();
        System.out.println("Last Cell Number:"+lastCell1);
        boolean equalRows = true;
        
        // Compare all cells in a row
        for(int i=firstCell1; i <lastCell1; i++) {
        	
            XSSFCell cell1 = row1.getCell(i);
            XSSFCell cell2 = row2.getCell(i);
      
            
            if(!compareTwoCells(cell1, cell2)) {
                equalRows = false;
                System.err.println("       Cell "+i+" - NOt Equal");
                break;
            } else {
                System.out.println("       Cell "+i+" - Equal");
            }
        }
        return equalRows;
    }

    /**
     *  Compare Two Cells
     * @param cell1
     * @param cell2
     * @return boolean
     */
    public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
        if((cell1 == null) && (cell2 == null)) {
            return true;
        } else if((cell1 == null) || (cell2 == null)) {
            return false;
        }
        
        boolean equalCells = false;
        int type1 = cell1.getCellType();
        int type2 = cell2.getCellType();
        if (type1 == type2) {
            if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
                // Compare cells based on its type
                switch (cell1.getCellType()) {
                case HSSFCell.CELL_TYPE_FORMULA:
                    if (cell1.getCellFormula().equals(cell2.getCellFormula())) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getCellFormula());
                        System.out.println("Compared Sheet Cell : "+cell2.getCellFormula());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getCellFormula());
                          System.out.println("Compared Sheet Cell :"+cell2.getCellFormula());
                    }
                    break;
                case HSSFCell.CELL_TYPE_NUMERIC:
                    if (cell1.getNumericCellValue() == cell2
                            .getNumericCellValue()) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getNumericCellValue());
                        System.out.println("Compared Sheet Cell : "+cell2.getNumericCellValue());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getNumericCellValue());
                          System.out.println("Compared Sheet Cell :"+cell2.getNumericCellValue());
                    }
                    break;
                case HSSFCell.CELL_TYPE_STRING:
                    if (cell1.getStringCellValue().equals(cell2
                            .getStringCellValue())) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getStringCellValue());
                        System.out.println("Compared Sheet Cell :"+cell2.getStringCellValue());
                    }else{
                    	System.out.println("Master Sheet Cell :"+cell1.getStringCellValue());
                        System.out.println("Comapred Sheet Cell :"+cell2.getStringCellValue());
                    }
                    break;
                case HSSFCell.CELL_TYPE_BLANK:
                    if (cell2.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getCellType());
                        System.out.println("Compared Sheet Cell : "+cell2.getCellType());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getCellType());
                          System.out.println("Compared Sheet Cell :"+cell2.getCellType());
                    }
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:
                    if (cell1.getBooleanCellValue() == cell2
                            .getBooleanCellValue()) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getBooleanCellValue());
                        System.out.println("Compared Sheet Cell : "+cell2.getBooleanCellValue());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getBooleanCellValue());
                          System.out.println("Compared Sheet Cell :"+cell2.getBooleanCellValue());
                    }
                    break;
                case HSSFCell.CELL_TYPE_ERROR:
                    if (cell1.getErrorCellValue() == cell2.getErrorCellValue()) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getErrorCellValue());
                        System.out.println("Compared Sheet Cell : "+cell2.getErrorCellValue());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getErrorCellValue());
                          System.out.println("Compared Sheet Cell :"+cell2.getErrorCellValue());
                    }
                    break;
                default:
                    if (cell1.getStringCellValue().equals(
                            cell2.getStringCellValue())) {
                        equalCells = true;
                        System.out.println("Master Sheet Cell :"+cell1.getStringCellValue());
                        System.out.println("Compared Sheet Cell : "+cell2.getStringCellValue());
                    }else{
                    	  System.out.println("Master Sheet Cell :"+cell1.getStringCellValue());
                          System.out.println("Compared Sheet Cell :"+cell2.getStringCellValue());
                    }
                    break;
                }
            } else { // Cell Style Don't Match
            	System.out.println("Master Sheet Cell Style ["+cell1.getCellStyle()+"] Doesnt Match With Compared Sheet Cell Style ["+cell2.getCellStyle()+"]");
                return false;
            }
        } else { // Cell Type Not Equal
        	System.out.println("Master Sheet Cell Type ["+type1+"] Doesnt Match With Compared Sheet Cell Type ["+type2+"]");
            return false;
        }
        return equalCells;
    }
}