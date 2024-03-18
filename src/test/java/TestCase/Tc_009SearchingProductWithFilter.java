package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;
import Page.SearchingProductWithFilterpage;

public class Tc_009SearchingProductWithFilter extends ProjectSpecification {
	
	@Test
	public void SearchingProductWithFilter() {
		
		HomePage objHomePage=new HomePage(driver);
		
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		
		objHomePage.SearchingProductWithFilter().search().searchbuttonclick().clickongooglebrand()
		.clickongoogleMobileandaddtocart().gotocart().checkoutpage().closeBrowser();
		
	}

}
