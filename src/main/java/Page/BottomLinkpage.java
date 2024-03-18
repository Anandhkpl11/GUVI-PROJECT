package Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecification;

public class BottomLinkpage extends ProjectSpecification {

	public BottomLinkpage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	public void bottomlinkvaliated() {
		
		
		
		WebElement link = driver.findElement(By.xpath("//*[@data-lid='ft_about_sustain']"));
		
		javascript(link);
		
		
		 if (!driver.getTitle().isEmpty()) {
             System.out.println("Link '" + link.getText() + "' is valid.");
         } else {
             System.out.println("Link '" + link.getText() + "' is broken or unreachable.");
         }
		
		closeBrowser();
		
	    
	  
	}

}
