package HeadlessTestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Page.Headlesspage;

public class Tc_001Test extends Headlesspage{
	
	
	@Test
	public void headlessbrowser() throws InterruptedException {
		Headlesspage obj=new Headlesspage();
		
		obj.headlessbrowser("https://www.bestbuy.com/").Selectanybrand().clickallmanu().brands().Apple()
		.Mac().iMac().addtocart();
	
		
		
		
		
	}

}
