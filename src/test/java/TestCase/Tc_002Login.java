package TestCase;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_002Login extends ProjectSpecification {
	
	@Test (dataProvider = "readdata")
	public void Login(String usernane,String password) throws MalformedURLException, IOException {
		
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		
		obj.login().validatewebsiteurl().Account().SignIn().mailaddress(usernane).password(password).signinbtn();
		
		
		
	}

}
