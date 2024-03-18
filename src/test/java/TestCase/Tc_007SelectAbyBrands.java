package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_007SelectAbyBrands extends ProjectSpecification {
	
	@Test
	public void SelectAbyBrands() {
		
		
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		
		obj.Selectanybrand().clickallmanu().brands().Apple().Mac().iMac()
		.iMac24().addtocart().closeBrowser();
		
	}

}
