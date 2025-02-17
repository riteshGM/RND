package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;


public class GetExcelDataUtil {
	
	public static final String EXCEL_RESOURCE_PATH = System.getProperty("user.dir")+"\\src\\com\\appname\\resources\\excels";
	
	
	public static XSSFWorkbook getWorkbook() throws FileNotFoundException, IOException{
		System.out.println("Resource Path "+EXCEL_RESOURCE_PATH);
		//return new XSSFWorkbook(new FileInputStream (new File( EXCEL_RESOURCE_PATH+"\\sheet1.xlsx")));
		return new XSSFWorkbook(new FileInputStream (EXCEL_RESOURCE_PATH+"\\sheet1.xlsx"));
	}
	
	public static XSSFSheet getSheet(int index) throws FileNotFoundException, IOException{
		return getWorkbook().getSheetAt(index);
	}
	
	public static XSSFSheet getSheet(String sheetName) throws FileNotFoundException, IOException{
		return getWorkbook().getSheet(sheetName);
	}
	
	public static XSSFRow getRow(String sheetName, int rowNum) throws FileNotFoundException, IOException{
		return getSheet(sheetName).getRow(rowNum);
	}
	
	public static XSSFRow getRow(int sheetIndex, int rowNum) throws FileNotFoundException, IOException{
		return getSheet(sheetIndex).getRow(rowNum);
	}
	
	public static int getTotalRows(String sheetName) throws FileNotFoundException, IOException{
		return getSheet(sheetName).getLastRowNum();
	}
	
	public static int getTotalRows(int sheetIndex) throws FileNotFoundException, IOException{
		return getSheet(sheetIndex).getLastRowNum();
	}
	
	public static HashMap<String,String> getFlatData() throws FileNotFoundException, IOException{
		HashMap<String,String> map = new HashMap<String,String>();
		Row headerRow = getRow(0,0);
		for (int rowNum =1;rowNum<=getTotalRows(0);rowNum++){
			Row eachRow = getRow(0,rowNum);
				for(int colNum = 0 ; colNum<eachRow.getLastCellNum(); colNum++ ){
					String value;
					switch(eachRow.getCell(colNum).getCellType()){
					//switch(eachRow.getCell(colNum)){
					
					//case XSSFCell.CELL_TYPE_STRING:
					case  STRING:
						map.put(headerRow.getCell(colNum).getStringCellValue(), eachRow.getCell(colNum).getStringCellValue());	
						break;
					case BOOLEAN:
						map.put(headerRow.getCell(colNum).getStringCellValue(), String.valueOf(eachRow.getCell(colNum).getBooleanCellValue()));
						break;	
					case NUMERIC:
						map.put(headerRow.getCell(colNum).getStringCellValue(),String.valueOf(eachRow.getCell(colNum).getNumericCellValue()));
						break;	
					default:
                        System.out.print("UNKNOWN\t");
                        map.put(headerRow.getCell(colNum).getStringCellValue(),""+(eachRow.getCell(colNum).getNumericCellValue())+"");
					}
				}
		}
		return map;
	}
}
