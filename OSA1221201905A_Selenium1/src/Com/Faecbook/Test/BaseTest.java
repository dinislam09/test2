package Com.Faecbook.Test;

import org.junit.Test;
import org.openqa.selenium.By;

public class BaseTest extends Browser {
	
	Shared s;
	
	@Test
	public void osaTest() throws InterruptedException {
		s=new Shared();
		s.getURL(dr, "http://www.osaconsultingtech.com/");
		s.Manage(dr);
		Thread.sleep(3000);
		s.click(dr, By.xpath("//*[@id=\"ftco-nav\"]/ul/li[7]/a"));
		s.sendkeys(dr, By.id("username"), "md.islam@osaconsultingtech.com");
		s.sendkeys(dr, By.id("password"), "5079Md1989");    //wrong
		s.click(dr, By.id("login_button"));
		
		
		}
	
	@Test
	public void facebook() {
		s=new Shared();
		s.getURL(dr,"http://www.facebook.com/");
		s.Manage(dr);
		s.sendkeys(dr, By.id("email"), "eggjiui");
		s.sendkeys(dr, By.xpath("//*[@id=\"pass\"]"), "3456555");
		s.click(dr, By.xpath("//*[@id=\"u_0_b\"]"));
		
		
}
}
