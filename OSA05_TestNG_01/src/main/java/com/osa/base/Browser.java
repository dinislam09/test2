package com.osa.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browser {
	WebDriver dr;
	private static Logger log =  Utilities.getLog(Browser.class);
	
	
	
	@Test
	public void openB() {
		
		log.info("Set Property");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manna\\Downloads\\chromedriver.exe");
		log.info("Open Blank Browser");
		dr=new ChromeDriver();
		log.info("Pass the URL");
		dr.get("https://www.facebook.com/");
		log.info("Enter Username");
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("User1");
		log.info("Enter Password");
		dr.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Pass1");
		log.info("click on login button");
		dr.findElement(By.xpath("//input[@value='Log In']")).click();
		log.info("Quite the driver");
		dr.quit();
		
		
	}
	

}
