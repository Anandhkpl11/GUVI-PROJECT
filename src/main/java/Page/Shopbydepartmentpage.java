package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class Shopbydepartmentpage extends ProjectSpecification {

	public Shopbydepartmentpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public Shopbydepartmentpage clickallmanu() {
		
		click("xpath", "//button[@aria-label='Menu']");
		return this;
		
	}
	
	public Shopbydepartmentpage tvandhometheater() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[5]");
		return this;
		
	}
	
	public Shopbydepartmentpage tvssize() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public Shopbydepartmentpage toptvdeal() {
		
		click("xpath", "//*[@data-lid='ubr_tv_sz_toptv']");
		return this;
		
	}
	
  public Shopbydepartmentpage samsung55inch() {
		
		click("partiallinktext", "Samsung - 55” Class CU7000 ");
		return this;
		
	}
  
  public Shopbydepartmentpage addtocart() {
		
		click("xpath", "(//*[@data-sku-id='6537366'])[1]");
		return this;
		
	}
	
	

}
