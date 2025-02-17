package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

public class ReArrangeExcel {

    public static void main(String[] args) {
        try {

            // list required column headers in order
            String[] outColumns = { "ID", "BRANCH", "SECTION", "YEAR", "NAME" };
            // get input excel file
            FileInputStream excellFile = new FileInputStream(new File(
                    "C:\\inputExcel.xlsx"));

            // Create Workbook instance holding reference to .xlsx file
            Workbook workbook1 = new XSSFWorkbook(excellFile);

            // Get first/desired sheet from the workbook
            Sheet mainSheet = workbook1.getSheetAt(0);

            // re-arrange the sheet based on headers
           Workbook outWorkBook = reArrange(mainSheet, mapHeaders(outColumns, mainSheet));
            excellFile.close();
            

            // write workbook into output file
            File mergedFile = new File("C:\\outExcel.xlsx");
            if (!mergedFile.exists()) {
                mergedFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(mergedFile);
            outWorkBook.write(out);
            out.close();
            System.out.println("File Columns Were Re-Arranged Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Workbook reArrange(Sheet mainSheet,
            LinkedHashMap<String, Integer> map) {

        // get column headers
        Set<String> colNumbs = map.keySet();

        // Create New Workbook instance
        Workbook outWorkbook = new XSSFWorkbook();
        Sheet outSheet = outWorkbook.createSheet();

        // map for cell styles
        Map<Integer, CellStyle> styleMap = new HashMap<Integer, CellStyle>();
        
        int colNum = 0;
        Row hrow = outSheet.createRow(0);
        for (String col : colNumbs) {
            Cell cell = hrow.createCell(colNum);
            cell.setCellValue(col);
            colNum++;
        }

        // This parameter is for appending sheet rows to mergedSheet in the end
        for (int j = mainSheet.getFirstRowNum() + 1; j <= mainSheet.getLastRowNum(); j++) {

            Row row = mainSheet.getRow(j);

            // Create row in main sheet
            Row mrow = outSheet.createRow(j);
            int num = -1;
            for (String k : colNumbs) {
                Integer cellNum = map.get(k);
                num++;
                if (cellNum != null) {
                    Cell cell = row.getCell(cellNum.intValue());

                    // if cell is null then continue with next cell
                    if(cell == null) {
                        continue;
                    }
                    // Create column in main sheet
                    Cell mcell = mrow.createCell(num);

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
        return outWorkbook;
    }

    // get Map of Required Headers and its equivalent column number 
    public static LinkedHashMap<String, Integer> mapHeaders(String[] outColumns,
            Sheet sheet) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        Row row = sheet.getRow(0);
        for (String outColumn : outColumns) {
            Integer icol = null;
            for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().equals(outColumn)) {
                    icol = new Integer(i);
                }
            }
            map.put(outColumn, icol);
        }
        return map;
    }
}