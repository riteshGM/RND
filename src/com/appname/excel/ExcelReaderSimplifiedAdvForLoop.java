package com.appname.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReaderSimplifiedAdvForLoop {
    public static void main(String[] args) {
        String filePath = "src/test/resources/TestData.xlsx"; // Update with your file path

        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Read first sheet

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case CellType.STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case CellType.NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case CellType.BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN\t");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
