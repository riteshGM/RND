package com.appname.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;


public class EvalvuateFormula {

	public static void main(String[] args) {
		File file = new File("filepath");
		try {
			Workbook book = new XSSFWorkbook(new FileInputStream(file));
			FormulaEvaluator evaluator = book.getCreationHelper().createFormulaEvaluator();
			Sheet sheet = book.getSheetAt(0);
			for(Row row : sheet) {
				for(Cell cell : row) {
					switch(cell.getCellType()) {
					case CellType.FORMULA :
							evaluator.evaluate(cell).formatAsString();
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
