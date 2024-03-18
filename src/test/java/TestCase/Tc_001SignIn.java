package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_001SignIn extends ProjectSpecification {
	
	//public static WebDriver driver;
	
	@Test
	public void SignIn() throws InterruptedException {
		
		HomePage obj=new HomePage(driver);
		
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com/");
		obj.signin().validatewebsite().createaccount().
		firstname().lasttname().email().password().repassword().phonenumber().createanaccount();
		
		
		

}
}
