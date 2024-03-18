package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class ShoppingCartpage extends ProjectSpecification {

	public ShoppingCartpage(WebDriver driver) {

		this.driver=driver;
	}
	
	public ShoppingCartpage search() {
		
		click("name", "st");
		sendkey("name", "st", "Apple");
		
		return this;
		
	}
	
	public ShoppingCartpage searchbuttonclick() {
		
		click("class", "header-search-button");
		return this;
	}
	
	public ShoppingCartpage applemacbook()  {
		
		click("xpath", "(//*[@data-button-state='ADD_TO_CART'])[2]");
		return this;
	}

}
