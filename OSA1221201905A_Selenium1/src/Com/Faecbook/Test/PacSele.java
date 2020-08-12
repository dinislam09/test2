package Com.Faecbook.Test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PacSele {
	@Test
public void add() { //before main method.
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shihab\\Desktop\\Osa 1221201905a//chromedriver.exe");
	
		ChromeDriver d=new ChromeDriver();
		
			//d.get("http://www.facebook.com/");
			//d.findElementByXPath("//*[@id=\"email\"]").sendKeys("jsjdjsjkfs");
			//d.findElementByXPath("//*[@id=\"pass\"]").sendKeys("232323");
			//d.findElementByXPath("//*[@id=\"u_0_b\"]").click();
		
		//Osa consulting Tech 
		
		d.get("http://www.osaconsultingtech.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(d.getCurrentUrl());
		
		
		d.findElementByXPath("//*[@id=\"ftco-nav\"]/ul/li[7]/a").click();
		d.findElementByXPath("//*[@id=\"username\"]").sendKeys("md.islam@osaconsultingtech.com");
		d.findElementByXPath("//*[@id=\"password\"]").sendKeys("dfsdgdfgdfg");
		d.findElementByXPath("//*[@id=\"login_button\"]").click();
		
		System.out.println(d.getTitle());
		
		d.close();
		
		d.quit();
			
}
}
