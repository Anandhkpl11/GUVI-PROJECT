package Page;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecification;

public class Loginpage extends ProjectSpecification {
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public  Loginpage validatewebsiteurl() throws MalformedURLException, IOException {
		
		
		String currentUrl = driver.getCurrentUrl();
		
		
		HttpURLConnection connection=(HttpURLConnection)(new URL(currentUrl).openConnection());
		connection.setRequestMethod("HEAD");
        connection.connect();
        int statusCode = connection.getResponseCode();
			
        System.out.println("URL: " + currentUrl + ", Status Code: " + statusCode);
        
        if (statusCode >= 200 && statusCode < 400) {
            System.out.println("The URL is reachable and not broken.");
        } else {
            System.out.println("The URL is broken.");
        }
	     
	     return this;
			
		}
	
	public Loginpage Account() {
		
		click("xpath", "//span[@class='v-p-right-xxs line-clamp']");
		return this;
		
	}
	
	public Loginpage SignIn() {
		
		click("linktext", "Sign In");
		return this;
		
	}
	
	public Loginpage mailaddress(String value) {
		sendkey("id", "fld-e", value);
		return this;
	}
	public Loginpage password(String value) {
		sendkey("id", "fld-p1", value);
		return this;
	}
	
	public Loginpage signinbtn() {
		click("xpath", "//button[@data-track='Sign In']");
		closeBrowser();
		return this;
	}

	
	
	
}
