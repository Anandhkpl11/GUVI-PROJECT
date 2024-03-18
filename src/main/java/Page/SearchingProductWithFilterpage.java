package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class SearchingProductWithFilterpage extends ProjectSpecification{

	public SearchingProductWithFilterpage(WebDriver driver) {

		this.driver=driver;
	}
	
	
	public SearchingProductWithFilterpage search() {
		
		click("name", "st");
		sendkey("name", "st", "Mobile");
		
		return this;
		
	}
	
	public SearchingProductWithFilterpage searchbuttonclick() {
		
		click("class", "header-search-button");
		return this;
	}
	
	public SearchingProductWithFilterpage clickongooglebrand() {
		
		click("id", "brand_facet-Google-5");
		return this;
	}
	
	public SearchingProductWithFilterpage clickongoogleMobileandaddtocart() {
		
		click("xpath", "(//*[text()='Add to Cart'])[2]");
		return this;
	}
	
	public SearchingProductWithFilterpage gotocart() {
		
		click("xpath", "//*[text()='Go to Cart']");
		return this;
	}
	
	public SearchingProductWithFilterpage checkoutpage() {
		
		click("xpath", "//*[text()='Checkout']");
		return this;
	}

}
