package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_008ChectoutdummypaymentandPlaceorder  extends ProjectSpecification{
	
	@Test
	public void Chectoutdummypayment() throws InterruptedException  {
		
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		
		obj.dummypaymentandplacorder().Account().SignIn().mailaddress().password().signinbtn().clickallmanu().tvandhometheater().tvssize().toptvdeal()
		.samsungtvAddtocart().gotocart().checkoutpage().emailaddress1().phnonenumber1().ContinuetoPaymentInformation().BillFirstName().BilllasttName1()
		.Address().city().state().ZipCode().placorder().closeBrowser();
		
		
	}

}
