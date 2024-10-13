package numpyninja.dsalgo.utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
	
	public static LoginDetails getLogin() {
		LoginDetails login = new LoginDetails(null, null);
		try {
			FileInputStream file = new FileInputStream(new File("data.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("login");
			Row row = sheet.getRow(1);
			login = new LoginDetails(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
			workbook.close();
		} catch (IOException e) {}
		
		return login;
	}	
	
	public static Testcase getTestcase(int test) {
		Testcase testcase = new Testcase(null, null);
		try {
			FileInputStream file = new FileInputStream(new File("data.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("editor");
			Row row = sheet.getRow(test);
			testcase = new Testcase(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
			workbook.close();
		} catch (IOException e) {}
		
		return testcase;
	}
	
	
}