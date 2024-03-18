package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Headlesspage  {
	
	public WebDriver driver;
	
		public Headlesspage headlessbrowser(String url) {
		
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu"); 
        driver = new ChromeDriver(options);
        driver.get(url);
		
        return this;
	}
	
	 public Headlesspage Selectanybrand() {
			
			driver.findElement(By.xpath("(//img[@alt='United States'])[1]")).click();
			return this;
	}
	
	
	 public Headlesspage clickallmanu() {
			
			
			driver.findElement(By.xpath("//button[@aria-label='Menu']")).click();
			return this;
			
		}

	   public Headlesspage brands() {
			
			driver.findElement(By.xpath("//button[@data-id='node-81']")).click();
			return this;
			
		}
	   
		public Headlesspage Apple() {
			
			driver.findElement(By.xpath("(//a[@data-t='header-navigation-anchor'])[1]")).click();
			
			return this;
			
		}
		
		public Headlesspage Mac() {
			
			driver.findElement(By.xpath("(//*[@class='flex-image-inner-wrapper flex-fluid-image'])[4]")).click();
			
			return this;
			
		}

		public Headlesspage iMac() {
			
			driver.findElement(By.xpath("(//*[@class='flex-image-inner-wrapper flex-fluid-image'])[10]")).click();
			
			
			return this;
					
			}	
		

//		public Headlesspage iMac24() {
//			
//			driver.findElement(By.partialLinkText("Retina 4.5K display All-In-One - Apple M1")).click();
//			
//			return this;
//					
//			}	   
			
					
					
		public Headlesspage addtocart() throws InterruptedException {
			
			Thread.sleep(3000);
           driver.findElement(By.xpath("(//*[@data-sku-id='6534764'])[3]")).click();
		     
		      
		      System.out.println("Completed the testcase");
				return this;
								
			}

}
