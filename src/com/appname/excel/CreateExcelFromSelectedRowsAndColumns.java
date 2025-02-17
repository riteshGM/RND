package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
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

public class CreateExcelFromSelectedRowsAndColumns {

    public static void main(String[] args) {
        try {
            // excel files
            FileInputStream excellFile1 = new FileInputStream(new File(
                    System.getProperty("user.dir")+"\\src\\com\\resources\\sheet1.xlsx"));
            
            // input row numbers and column numbers
            int[] irows = { 0,1, 2, 3, 4};
            int[] icols = { 0,1, 2};
            
            // Create Workbook instance holding reference to .xlsx file
            Workbook workbook = new XSSFWorkbook(excellFile1);

            // Get first/desired sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // add sheet2 to sheet1
            Workbook outWorkbook = getFilteredWorkBook(sheet, irows, icols);
            
            
            
            
            excellFile1.close();

            
            
            
            // save merged file
            File outFile = new File(System.getProperty("user.dir")+"\\src\\com\\resources\\created.xlsx");
            if (!outFile.exists()) {
                outFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(outFile);
            outWorkbook.write(out);
            out.close();
            System.out.println("Files were merged succussfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Workbook getFilteredWorkBook(Sheet sheet,
            int[] irows, int[] icols) {
        // create New workbook 
        Workbook workbook = new XSSFWorkbook();
        Sheet outSheet = workbook.createSheet();
        Map<Integer, CellStyle> styleMap = new HashMap<Integer, CellStyle>();
        int i = 0;
        
        // get rows with given row numbers 
        for (int rowNum : irows) {
            if (rowNum >= sheet.getFirstRowNum()
                    && rowNum <= sheet.getLastRowNum()) {
                
                // create new row
                Row outRow = outSheet.createRow(i);
                Row row = sheet.getRow(rowNum);
                int j = 0;
                
                // get columns with given column numbers
                for (int colNum : icols) {
                    if (colNum >= sheet.getRow(0).getFirstCellNum()
                            && colNum <= sheet.getRow(0).getLastCellNum()) {
                        
                        // create new column
                        Cell outCell = outRow.createCell(j);
                        Cell cell = row.getCell(colNum);
                        if (cell != null) {
                            j++;
                            if (cell.getSheet().getWorkbook() == outCell
                                    .getSheet().getWorkbook()) {
                                outCell.setCellStyle(cell.getCellStyle());
                            } else {
                                int stHashCode = cell.getCellStyle().hashCode();
                                CellStyle newCellStyle = styleMap
                                        .get(stHashCode);
                                if (newCellStyle == null) {
                                    newCellStyle = outCell.getSheet()
                                            .getWorkbook().createCellStyle();
                                    newCellStyle.cloneStyleFrom(cell
                                            .getCellStyle());
                                    styleMap.put(stHashCode, newCellStyle);
                                }
                                outCell.setCellStyle(newCellStyle);
                            }

                            switch (cell.getCellType()) {
                            case FORMULA:
                                outCell.setCellFormula(cell.getCellFormula());
                                break;
                            case NUMERIC:
                                outCell.setCellValue(cell.getNumericCellValue());
                                break;
                            case STRING:
                                outCell.setCellValue(cell.getStringCellValue());
                                break;
                            case BLANK:
                                outCell.setBlank();
                                break;
                            case BOOLEAN:
                                outCell.setCellValue(cell.getBooleanCellValue());
                                break;
                            case ERROR:
                                outCell.setCellErrorValue(cell
                                        .getErrorCellValue());
                                break;
                            default:
                                outCell.setCellValue(cell.getStringCellValue());
                                break;
                            }

                        }

                    }
                }
                i++;
            }
        }
        return workbook;

    }

}