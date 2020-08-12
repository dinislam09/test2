package Com.Faecbook.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Test {
	
	static ChromeDriver dr;
	
	
	public static void main(String[] args) {
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shihab\\Desktop\\Osa 1221201905a\\ChD\\chromedriver.exe");
		    dr = new ChromeDriver();
			dr.get("https://www.facebook.com/");  
			dr.manage().window().maximize();
	        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select dd = new Select(dr.findElement(By.xpath("//*[@id=\"month\"]")));
			dd.selectByIndex(10);
			
			Select d = new Select(dr.findElement(By.xpath("//select[@aria-label=\"Year\"]")));
			d.selectByVisibleText("1991");
			
			
			dr.findElementByXPath("//*[@id=\"u_0_8\"]").click(); // FB Custom
			
			JavascriptExecutor jse = (JavascriptExecutor)dr;
			jse.executeScript("window.scrollBy(0,300)");
			
			
	        List <WebElement>links	=dr.findElements(By.tagName("a"));   
			System.out.println(links.size());  
			
			
			 //java.util.List<WebElement> links = dr.findElements(By.tagName("a"));  //
			 
			// System.out.println(links.size());   //
			 
			 for (int i = 1; i<=links.size(); i=i+1)
			 
			 {
			 
			 System.out.println(links.get(i).getText());}
			 

			
	}
}
	

	
	
	




