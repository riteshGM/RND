package com.appname.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrieveDataFromExcelFile {

	public static void main(String[] args) throws IOException {
	//Read Data (in bytes) from Excel file  
	FileInputStream fis = new FileInputStream(".//Login credentials.xlsx");
	//create workbook instance 
	XSSFWorkbook wb1 = new XSSFWorkbook(fis);
	// Get access to Sheet 1 
	XSSFSheet sheet = wb1.getSheetAt(0);
	// Iteration through each row using for loop
	for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
	XSSFRow rowObj = sheet.getRow(row);
	// Iteration through each cell using for loop
	for (int col = 0; col < rowObj.getPhysicalNumberOfCells(); col++) {
	XSSFCell cellObj = rowObj.getCell(col);
	// Retrieving cell value
	String cellValue = cellObj.getStringCellValue();
	System.out.println(cellValue);
			}
		}
}
}
