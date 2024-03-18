package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_006Shopbydepartment extends ProjectSpecification {
	
	@Test
	public void Shopbydepartment() {
		
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		
		obj.shopbydepartment().clickallmanu().tvandhometheater().tvssize().toptvdeal().samsung55inch().addtocart();
		
		
	}

}
