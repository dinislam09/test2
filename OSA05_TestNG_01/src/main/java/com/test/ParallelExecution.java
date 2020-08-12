package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {

	
	
	WebDriver dr;
	
	@Test
	@Parameters({"username", "password"})
	public void test1(String username, String password) throws IOException {
		
		/*
		FileInputStream fl = new FileInputStream("C:\\Users\\manna\\Desktop\\OSA0706201902A\\OSA05_TestNG_01\\src\\main\\resources\\config.properties");
		
		Properties p = new Properties();
		p.load(fl);
		
		p.getProperty("username");
		*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Downloads\\chromedriver.exe");
	
		dr=new ChromeDriver();
		dr.get("https://facebook.com/");
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		dr.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	
	
	
	@Test
	public void test2() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\manna\\Downloads\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr=new FirefoxDriver();
		dr.get("https://facebook.com/");
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("user1");
		dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pass1");
		dr.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
