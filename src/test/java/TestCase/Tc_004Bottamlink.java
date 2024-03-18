package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_004Bottamlink extends ProjectSpecification{

	
	@Test
	public void bottomlink() {
		
		HomePage obj=new HomePage(driver);
		
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		
		obj.Bottomlink().bottomlinkvaliated();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
