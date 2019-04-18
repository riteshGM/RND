package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFCell;
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
            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile);

            // Get first/desired sheet from the workbook
            XSSFSheet mainSheet = workbook1.getSheetAt(0);

            // re-arrange the sheet based on headers
            XSSFWorkbook outWorkBook = reArrange(mainSheet, mapHeaders(outColumns, mainSheet));
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

    public static XSSFWorkbook reArrange(XSSFSheet mainSheet,
            LinkedHashMap<String, Integer> map) {

        // get column headers
        Set<String> colNumbs = map.keySet();

        // Create New Workbook instance
        XSSFWorkbook outWorkbook = new XSSFWorkbook();
        XSSFSheet outSheet = outWorkbook.createSheet();

        // map for cell styles
        Map<Integer, XSSFCellStyle> styleMap = new HashMap<Integer, XSSFCellStyle>();
        
        int colNum = 0;
        XSSFRow hrow = outSheet.createRow(0);
        for (String col : colNumbs) {
            XSSFCell cell = hrow.createCell(colNum);
            cell.setCellValue(col);
            colNum++;
        }

        // This parameter is for appending sheet rows to mergedSheet in the end
        for (int j = mainSheet.getFirstRowNum() + 1; j <= mainSheet.getLastRowNum(); j++) {

            XSSFRow row = mainSheet.getRow(j);

            // Create row in main sheet
            XSSFRow mrow = outSheet.createRow(j);
            int num = -1;
            for (String k : colNumbs) {
                Integer cellNum = map.get(k);
                num++;
                if (cellNum != null) {
                    XSSFCell cell = row.getCell(cellNum.intValue());

                    // if cell is null then continue with next cell
                    if(cell == null) {
                        continue;
                    }
                    // Create column in main sheet
                    XSSFCell mcell = mrow.createCell(num);

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

                    // set value based on cell type
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
        return outWorkbook;
    }

    // get Map of Required Headers and its equivalent column number 
    public static LinkedHashMap<String, Integer> mapHeaders(String[] outColumns,
            XSSFSheet sheet) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        XSSFRow row = sheet.getRow(0);
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