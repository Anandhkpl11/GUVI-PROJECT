package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_005Shoppingcart extends ProjectSpecification {

	
	@Test
	public void Shopping()  {
		
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		
		obj.shopping().search().searchbuttonclick().applemacbook();
		
		closeBrowser();
		
	}
	
	
}
