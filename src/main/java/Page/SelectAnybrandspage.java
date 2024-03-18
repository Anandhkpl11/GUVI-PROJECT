package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class SelectAnybrandspage extends ProjectSpecification {
	
	
   public SelectAnybrandspage(WebDriver driver) {
		
	   this.driver=driver;
	}
   
   public SelectAnybrandspage clickallmanu() {
		
		click("xpath", "//button[@aria-label='Menu']");
		return this;
		
	}

   public SelectAnybrandspage brands() {
		
		click("xpath", "//button[@data-id='node-81']");
		return this;
		
	}
   
	public SelectAnybrandspage Apple() {
		click("xpath", "(//a[@data-t='header-navigation-anchor'])[1]");
		return this;
		
	}
	
	public SelectAnybrandspage Mac() {
		click("xpath", "(//*[@class='flex-image-inner-wrapper flex-fluid-image'])[4]");
		return this;
		
	}

	public SelectAnybrandspage iMac() {
		click("xpath", "(//*[@class='flex-image-inner-wrapper flex-fluid-image'])[10]");
		return this;
				
		}	
	

	public SelectAnybrandspage iMac24() {
		click("partiallinktext", "Retina 4.5K display All-In-One - Apple M1");
		return this;
				
		}	   
		
				
				
	public SelectAnybrandspage addtocart() {
	      click("xpath", "(//*[@data-sku-id='6450927'])[1]");
			return this;
							
		}
			
}
