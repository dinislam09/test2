package Com.Faecbook.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shared extends Browser{
	
	public void getURL(WebDriver dr,String Url) {
		dr.get(Url);
	} 
	//public void sendkeys(WebElement ele,String value) {
	//	ele.sendKeys(value);
	//} 
	
	public void sendkeys(WebDriver dr,By by,String value) {
		dr.findElement(by).sendKeys(value);
		
} 
	public void click(WebDriver dr,By by) {
		dr.findElement(by).click();
		
	} 
	
	public void Manage(WebDriver dr) {
		dr.manage().window().maximize();
		
	}

}
