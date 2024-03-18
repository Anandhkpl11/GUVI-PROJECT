package Page;

import org.bouncycastle.asn1.cms.CMSORIforKEMOtherInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecification;

public class Chectoutdummypaymentpage  extends ProjectSpecification{

	public Chectoutdummypaymentpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public Chectoutdummypaymentpage Account() {
		
		click("xpath", "//span[@class='v-p-right-xxs line-clamp']");
		return this;
		
	}
	
	public Chectoutdummypaymentpage SignIn() {
		
		click("linktext", "Sign In");
		return this;
		
	}
	
	public Chectoutdummypaymentpage mailaddress() {
		sendkey("id", "fld-e", "anandhmoorthi190@gmail.com");
		return this;
	}
	public Chectoutdummypaymentpage password() {
		sendkey("id", "fld-p1","Moorthi@05");
		return this;
	}
	
	public Chectoutdummypaymentpage signinbtn() {
		click("xpath", "//button[@data-track='Sign In']");
		
		return this;
	}
	
	public Chectoutdummypaymentpage clickallmanu() {
		
		click("xpath", "//button[@aria-label='Menu']");
		return this;
		
	}
	
	
	public Chectoutdummypaymentpage tvandhometheater() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[5]");
		return this;
		
	}
	
	
	public Chectoutdummypaymentpage tvssize() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public Chectoutdummypaymentpage toptvdeal() {
		
		click("xpath", "//*[@data-lid='ubr_tv_sz_toptv']");
		return this;
		
	}
	
	public Chectoutdummypaymentpage samsungtvAddtocart()   {
		click("xpath", "(//*[text()='Add to Cart'])[1]");
		return this;
	}
	
	public Chectoutdummypaymentpage gotocart() {
		click("xpath", "//*[text()='Go to Cart']");
		return this;
		
	}
	
	public Chectoutdummypaymentpage checkoutpage() {
		click("xpath", "//*[text()='Checkout']");
		return this;
		
	}
	
	
//	public Chectoutdummypaymentpage ContinueAsGest() {
//		click("xpath", "//*[text()='Continue as Guest']");
//		return this;
//		
//	}
	
	

	
	public Chectoutdummypaymentpage emailaddress1() {
		sendkey("id", "user.emailAddress", "anandhmoorthi190@gmail.com");
		return this;
		
	}
	
	public Chectoutdummypaymentpage phnonenumber1() {
		sendkey("id", "user.phone", "7864346789");
		return this;
		
	}
	
	public Chectoutdummypaymentpage ContinuetoPaymentInformation() {
		click("xpath", "//*[text()='Continue to Payment Information']");
		return this;
		
	}
	

	public Chectoutdummypaymentpage Creditcardnumber() {
		sendkey("id", "number", "5645 6788 2355 6345");
		return this;
		
	}
	
	
	public Chectoutdummypaymentpage BillFirstName() {
		sendkey("id", "first-name", "Anandha");
		return this;
		
	}
	
	public Chectoutdummypaymentpage BilllasttName1() {
		sendkey("id", "last-name", "kumar");
		return this;
		
	}
	
	public Chectoutdummypaymentpage Address() {
		sendkey("id", "address-input", "chennai");
		return this;
		
	}
	
	public Chectoutdummypaymentpage city() {
		sendkey("id", "city", "chennai");
		return this;
		
	}
	
	public Chectoutdummypaymentpage state() {
	
		dropdown("id", "state", "IN");
		return this;
		
	}
	
	public Chectoutdummypaymentpage ZipCode() {
		
		sendkey("id", "postalCode", "64100");
		return this;
		
	}
	
	
	public Chectoutdummypaymentpage placorder() {
		
		click("xpath", "//*[text()='Place Your Order']");
		return this;
		
	}
	
}
