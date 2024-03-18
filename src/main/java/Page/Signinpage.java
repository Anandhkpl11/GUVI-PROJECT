package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class Signinpage extends ProjectSpecification {
	
	
	public Signinpage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public Signinpage validatewebsite() {
		
     if(driver.getTitle() == null||driver.getTitle().isEmpty()) {
			
			System.out.println("URL is broken or unreachable");
		}else {
			System.out.println("URL is reachable and valid");
		}
     
     return this;
		
	}
	
	
	public Signinpage Account() {
		
		click("xpath", "//span[@class='v-p-right-xxs line-clamp']");
		return this;
		
	}
	
	public Signinpage createaccount() throws InterruptedException {
		
		Thread.sleep(3000);
		click("linktext", "Create Account");
		return this;
		
	}
	
	public Signinpage firstname() {
		
		sendkey("id", "firstName", "Anandh");
		return this;
		
	}
	
	public Signinpage lasttname() {
		
		sendkey("id", "lastName", "kumar");
		return this;
		
	}
	
   public Signinpage email() {
		
		sendkey("id", "email", "anandhakumarak92@gmail.com");
		return this;
		
	}
   
   public Signinpage password() {
		
		sendkey("id", "fld-p1", "Moorthi@05");
		return this;
		
	}
   
   public Signinpage repassword() {
		
		sendkey("id", "reenterPassword", "Moorthi@05");
		return this;
		
	}
   
   
   public Signinpage phonenumber() {
		
		sendkey("id", "phone","7845344567");
		return this;
		
	}
   
   public Signinpage createanaccount() {
		
		click("xpath", "//*[@data-track='Create Account']");
		closeBrowser();
		return this;
		
	}
   

}
