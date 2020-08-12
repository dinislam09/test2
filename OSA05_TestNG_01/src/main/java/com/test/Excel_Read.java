package com.test;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_Read {
	WebDriver dr;
	
	
	@DataProvider(name="facebook")
	public Object[][] excelRead() throws IOException {
	
		FileInputStream fl = new FileInputStream("C:\\Users\\manna\\Desktop\\book.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fl);
		
		XSSFSheet sheet = workbook.getSheet("Menu");
		
		int rowSize = sheet.getLastRowNum();
		int cellSize= sheet.getRow(0).getLastCellNum();
		
		System.out.println(rowSize);
		System.out.println(cellSize);
		
		Object[][] data = new Object[rowSize][cellSize];
	
		for (int i=1; i<=rowSize; i++) {
			
			for(int j=0; j<cellSize; j++) {
				
				    data[i-1][j]= sheet.getRow(i).getCell(j);
			}
			
			
		}
		
		
		
		
		return data;
	
			
			}  
			  
			
			
			
		
	
		
	
	
	
	
	
	@DataProvider(name="login")
	public static Object[][] getData() {
		Object[][] obj = new Object[2][2];
		
		obj[0][0]="User1";
		obj[0][1]="Pass1";
	
		
		obj[1][0]="User2";
		obj[1][1]="Pass3";
		
		
		
		
		
		//Object[][] obj1= {{"User1", "Pass1"},{"User2","Pass2"}};
		
		
		
		return obj;
		
		
		
	}
	
	
	
	
	
	public static int add() {
		int a=9;
		return a;
	}
	
	
	public static int[] add1() {
		
		int[] a = new int[4];
		
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=7;
		
		//int[] a = {5,6,7,8}; 
		return a;
	}
	
	
	
	
	@Test(dataProvider="facebook")
	public void test(Object usename, Object password) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Downloads\\chromedriver.exe");
			
			dr=new ChromeDriver();
			dr.get("https://facebook.com/");
			dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(usename.toString());
			dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password.toString());
			dr.findElement(By.xpath("//input[@value='Log In']")).click();
			dr.quit();
		
	}
	
	
	
	
	
	

}
