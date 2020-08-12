package Com.Faecbook.Test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
 WebDriver dr;
 
 
 
 @Before
 public void openBrowse() {
	 String key="webdriver.chrome.driver";
	 String value="C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe";
	 System.setProperty(key, value);
	 dr = new ChromeDriver();
	 
}
 
 @After
 public void closeBrowser() {
	 dr.close();
	 
}
 
}
