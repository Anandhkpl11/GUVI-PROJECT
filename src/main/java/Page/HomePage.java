package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import Base.ProjectSpecification;
import io.github.sukgu.support.FindElementBy;

public class HomePage extends ProjectSpecification {
	
	//public WebDriver driver;
	
	public HomePage(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	}
	
   public Signinpage signin() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new Signinpage(driver);
		
	}
   
   public Loginpage login() {
	   click("xpath", "(//img[@alt='United States'])[1]");
	   return new Loginpage(driver);
   }
   
   public AllMenuPage allmenu() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new AllMenuPage(driver);
   }
	
	
   public BottomLinkpage Bottomlink() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new BottomLinkpage(driver);
  }
	
   public ShoppingCartpage shopping() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new ShoppingCartpage(driver);
 }
   
   public Shopbydepartmentpage shopbydepartment() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new Shopbydepartmentpage(driver);
}
	
   public SelectAnybrandspage Selectanybrand() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new SelectAnybrandspage(driver);
}

   public Chectoutdummypaymentpage dummypaymentandplacorder() {
	
	click("xpath", "(//img[@alt='United States'])[1]");
	return new Chectoutdummypaymentpage(driver);
}

   public SearchingProductWithFilterpage SearchingProductWithFilter() {
		
		click("xpath", "(//img[@alt='United States'])[1]");
		return new SearchingProductWithFilterpage(driver);
	}


}
