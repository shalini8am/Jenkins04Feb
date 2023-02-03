package org.reusablecodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {

	public static WebDriver driver; // static variable

	public static void browserLaunch() { // local variable
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void edgeBrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	public static void launchUrl(String url) {
		
		driver.get(url);
	}

	public static void pageMax() {
		driver.manage().window().maximize();
	}

	public static String pageTitle() {
		String x = driver.getTitle();
		return x;
	}

	public static String pageUrl() {
		String y = driver.getCurrentUrl();
		return y;
	}

	public static void txtBox(WebElement element, String txt) {
		element.sendKeys(txt);
	}
	
	public static void btnLogin(WebElement btn) {
		btn.click();
	}

	public static void btnCreate(WebElement create) {
		create.click();
	}
	
	public static void closeBrowser() {
		driver.close();
	}

	// Excel read
	public static String excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		// 1.Mention Excel File path
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Maven8am\\ExcelSheets\\8am.xlsx");

		// 2.Read a file
		FileInputStream fi = new FileInputStream(f); // FileNotFoundException

		// 3. Read the exact file format
		Workbook wb = new XSSFWorkbook(fi); // IOException

		// 4. get the Sheet from workbook
		Sheet s = wb.getSheet(sheetName);

		Row r = s.getRow(rowNum);

		// Each cell type
		Cell c = r.getCell(cellNum);

		int cellType = c.getCellType();

		// By default whether cellType ==1 ----> String cell
		// cellType otherthan 1 ---> Numeric cell or Date cell

		String value = "";

		if (cellType == 1) {
			value = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			value = sdf.format(d);
		} else {
			double d1 = c.getNumericCellValue();// 456732.0
			long l = (long) d1; // downcasting
			value = String.valueOf(l);
		}
		return value;
	}

	// Create New File
	public static void createExcelFile(int rowNum, int cellNum) throws IOException {

		// 1. Mention the path location
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Maven8am\\ExcelSheets\\Excel1.xlsx");

		// 2. create workbook
		Workbook w = new XSSFWorkbook(); // UpCasting

		// 3. create sheet in workbook
		Sheet newSheet = w.createSheet("Values Set");

		// 4. Create row in sheet
		Row newRow = newSheet.createRow(rowNum);

		// 5. Create cell in row
		Cell newCell = newRow.createCell(cellNum);

		// set the data in 0th row & 0th cell
		newCell.setCellValue("Framework");

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		w.write(fos); // IO Exception

		System.out.println("Writed...");
	}

	// To Create new cell only
	public static void createCellOnly(String sheetName, int getTheRow, int createCell, String newData)
			throws IOException {

		// 1. Mention the path location
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Maven8am\\ExcelSheets\\Excel1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		// 2. create workbook
		Workbook w = new XSSFWorkbook(fis); // UpCasting

		// 3. create sheet in workbook
		Sheet newSheet = w.getSheet(sheetName);

		// 4. Create row in sheet
		Row newRow = newSheet.getRow(getTheRow);

		// 5. Create cell in row
		Cell newCell = newRow.createCell(createCell);

		// set the data in 0th row & 1st cell
		newCell.setCellValue(newData);

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException

		w.write(fos);

		System.out.println("Writed...");
	}

	// Create Row Only
	public static void createRowOnly(String sheetName, int createRow, int createCell, String newData)
			throws IOException {
		// 1. Mention the path location
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Maven8am\\ExcelSheets\\Excel1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		// 2. create workbook
		Workbook w = new XSSFWorkbook(fis); // UpCasting

		// 3. create sheet in workbook
		Sheet newSheet = w.getSheet(sheetName);

		// 4. Create row in sheet
		Row newRow = newSheet.createRow(createRow);

		// 5. Create cell in row
		Cell newCell = newRow.createCell(createCell);

		// set the data in 1st row & 0th cell
		newCell.setCellValue(newData);

		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException
		w.write(fos);
		System.out.println("Writed...");
	}

	// Replace the cell
	public static void updateCell(String sheetName,int getTheRow,int getTheCell,String existingData,String replaceData) 
			throws IOException {
		// 1. Mention the path location
		File f = new File("C:\\Users\\kumar\\eclipse-workspace\\Maven8am\\ExcelSheets\\Excel1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		// 2. create workbook
		Workbook w = new XSSFWorkbook(fis); // UpCasting

		// 3. create sheet in workbook
		Sheet newSheet = w.getSheet(sheetName);

		// 4. Create row in sheet
		Row newRow = newSheet.getRow(getTheRow);

		// 5. Create cell in row
		Cell newCell = newRow.getCell(getTheCell);
        
		String value = newCell.getStringCellValue();
		
		if (value.equals(existingData)) {
			newCell.setCellValue(replaceData);
		}
		
		FileOutputStream fos = new FileOutputStream(f); // FileNotFoundException
		w.write(fos);
		System.out.println("Writed...");
	}

}
