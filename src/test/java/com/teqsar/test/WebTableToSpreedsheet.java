package com.teqsar.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.Annotations.FrameWorkAnnotation;
import com.teqsar.driver.DriverManager;
import com.teqsar.enums.CatrgoryType;
import com.teqsar.pages.WebTablePage;  

public class WebTableToSpreedsheet  extends BaseTest{ 



	@FrameWorkAnnotation(author= {"Narayana","Swamy"}, category= {CatrgoryType.REGRESSION,CatrgoryType.SANITY})
	@Test
	public static void webTableTest(Map<String,String> data) throws IOException {

		new WebTablePage();
		System.out.println(DriverManager.getDriver().getTitle() +" - WebPage has been launched");  
		List<WebElement> irows =   DriverManager.getDriver().findElements(By.xpath("//*[@id='main']/table[1]/tbody/tr"));     
		int iRowsCount = irows.size();     
		List<WebElement> icols =   DriverManager.getDriver().findElements(By.xpath("//*[@id='main']/table[1]/tbody/tr[1]/th"));     
		int iColsCount = icols.size();     
		System.out.println("Selected web table has " +iRowsCount+ " Rows and " +iColsCount+ " Columns");     
		System.out.println();      
		FileOutputStream fos = new FileOutputStream("D:\\Demo Automation\\Frameworkselenium\\src\\test\\resources\\ExcelSheets\\EXPORTDATA.xlsx");
		XSSFWorkbook wkb = new XSSFWorkbook();       
		XSSFSheet sheet1 = wkb.createSheet("DataStorage"); 
		for (int i=1;i<=iRowsCount;i++)      
		{               
			for (int j=1; j<=iColsCount;j++)                    
			{           
				if (i==1)       
				{           
					WebElement val= DriverManager.getDriver().
							findElement(By.xpath("//*[@id='main']/table[1]/tbody/tr["+i+"]/th["+j+"]"));             
					String  a = val.getText();            
					System.out.print(a);                        

					XSSFRow excelRow = sheet1.createRow(i);             
					XSSFCell excelCell = excelRow.createCell(j);                  
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);                 
					excelCell.setCellValue(a);  

					//wkb.write(fos);       
				}       
				else        
				{           
					WebElement val= DriverManager.getDriver().
							findElement(By.xpath("//*[@id='main']/table[1]/tbody/tr["+i+"]/td["+j+"]"));             
					String a = val.getText();                    
					System.out.print(a);                            

					XSSFRow excelRow = sheet1.createRow(i);             
					XSSFCell excelCell = excelRow.createCell(j);                      
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);                   
					excelCell.setCellValue(a);   

					//wkb.write(fos);       
				}       
			}               
			System.out.println();     
		} 
		fos.flush();     
		wkb.write(fos);     
		fos.close(); 
	}
}

/*	

		System.out.println("Hello Dear.....");     
		System.out.println();  

		WebDriver wb = new FirefoxDriver();          
		wb.navigate().to("http://www.w3schools.com/html/html_tables.asp"); 
		wb.manage().window().maximize();     
		System.out.println(wb.getTitle() +" - WebPage has been launched");   

		List<WebElement> irows =   wb.findElements(By.xpath("//*[@id='main']/table[1]/tbody/tr"));     
		int iRowsCount = irows.size();     
		List<WebElement> icols =   wb.findElements(By.xpath("//*[@id='main']/table[1]/tbody/tr[1]/th"));     
		int iColsCount = icols.size();     
		System.out.println("Selected web table has " +iRowsCount+ " Rows and " +iColsCount+ " Columns");     
		System.out.println();      

		try {
			FileOutputStream fos = new FileOutputStream("D://Software//AutomationPractise//WebTableTOSpreedsheet.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                 

		XSSFWorkbook wkb = new XSSFWorkbook();       
		XSSFSheet sheet1 = wkb.createSheet("DataStorage"); 

		for (int i=1;i<=iRowsCount;i++)      
		{               
			for (int j=1; j<=iColsCount;j++)                    
			{           
				if (i==1)       
				{           
					WebElement val= wb.findElement(By.xpath("//*[@id='main']/table[1]/tbody/tr["+i+"]/th["+j+"]"));             
					String  a = val.getText();            
					System.out.print(a);                        

					XSSFRow excelRow = sheet1.createRow(i);             
					XSSFCell excelCell = excelRow.createCell(j);                  
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);                 
					excelCell.setCellValue(a);  

					//wkb.write(fos);       
				}       
				else        
				{           
					WebElement val= wb.findElement(By.xpath("//*[@id='main']/table[1]/tbody/tr["+i+"]/td["+j+"]"));             
					String a = val.getText();                    
					System.out.print(a);                            

					XSSFRow excelRow = sheet1.createRow(i);             
					XSSFCell excelCell = excelRow.createCell(j);                      
					excelCell.setCellType(XSSFCell.CELL_TYPE_STRING);                   
					excelCell.setCellValue(a);   

					//wkb.write(fos);       
				}       
			}               
			System.out.println();     
		}     

 */

