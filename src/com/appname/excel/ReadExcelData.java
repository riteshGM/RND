package com.appname.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;

public class ReadExcelData {
	public static final String EXCEL_RESOURCE_PATH = System.getProperty("user.dir")+"\\src\\com\\appname\\resources\\excels";
	
	//static HashMap<String,String> map = new HashMap<String,String>();
	
	public static void main (String args[]) throws FileNotFoundException, IOException{
		XSSFRow row =GetExcelDataUtil.getRow(0, 0);
		
		System.out.println(row.getCell(0));
		
		/*FileInputStream filePipe = new FileInputStream(new File (EXCEL_RESOURCE_PATH+"\\sheet1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(filePipe);
		XSSFSheet sheet =  workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		System.out.println(row.getCell(0));
		
		workbook.close();*/
		
		HashMap<String,String> map =GetExcelDataUtil.getFlatData();
		
		System.out.println(map.get("CUS_IDR"));
		
		System.out.println(map);
		
		
		
	}
	
	

}
