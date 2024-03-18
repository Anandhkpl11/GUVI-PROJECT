package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.ProjectSpecification;
import Page.HomePage;

public class Tc_003AllMenu extends ProjectSpecification{
	
		
	
		
	//@Ignore
	@Test(priority=1)
	public void dealvaliate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().deal().topdeal().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=2)
	public void supportservicevaliate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().supportservice().vistsupportcenter().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=3)
	public void brandvaliate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().brands().Apple().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=4)
	public void appliancevaliate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().appliance().kitchanappliance().validatewebsite();
		
	}
	
	//@Ignore
	@Test (priority=5)
	public void tvandhometheatervaliate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().tvandhometheater().tvssize().toptvdeal().validatewebsite();
		
	}
	
	//@Ignore
	@Test (priority=6)
	public void computerAndLaptopValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().computerandtablet().laptopanddesktop().laptop().validatewebsite();
		
	}
	
	//@Ignore
	@Test (priority=7)
	public void cellphoneValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().cellphone().unlockphone().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=8)
	public void audioValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().audio().homeAudio().speaker().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=9)
	public void videoGameValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().videoGame().xboxseries().xboxseriesconsole().validatewebsite();
		
	}
	//@Ignore
	@Test (priority=10)
	public void cameraValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().cameras().camerasandlenses().topcameradeal().validatewebsite();
		
	}
	
	//@Ignore
	@Test (priority=11)
	public void homefurnitureValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().homefurniture().home().appliances().validatewebsite();
		
	}
	
	
	//@Ignore
	@Test (priority=12)
	public void smarthomeValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().smarthome().wifiandnetwork().router().validatewebsite();
		
	}
	
	

	//@Ignore
	@Test (priority=13)
	public void carelectronicsValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().carelectronics().caraudio().carstrero().validatewebsite();
		
		
	}
	
	
	//@Ignore
	@Test (priority=14)
	public void movieandmusicValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().movieandmusic().movieandtvshow().movieandtvshowpreordeer().validatewebsite();
		
		
	}
	
	
	//@Ignore
	@Test (priority=15)
	public void wearbleValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().wearable().applewatch().applewatchultra2().validatewebsite();
		
		
	}
	
	
	//@Ignore
	@Test (priority=16)
	public void healthwelnessValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().healthandwelness().homehealthcar().bloodpressure().validatewebsite();
		
		
	}
	
	
	//@Ignore
	@Test (priority=17)
	public void outdoorandlivingValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().outdoorandliving().patiofurniture().patiodiningset().validatewebsite();
		
		
		
	}
	
	//@Ignore
	@Test (priority=18)
	public void toygameValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().toyandgamescollection().toytype().toyguide().validatewebsite();
		
		
		
	}
	
	
	//@Ignore
	@Test (priority=19)
	public void electrictransportationValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().electricandtransportation().electricbike().stepthrowelectricbike().validatewebsite();
		
		
		
	}
	
	//@Ignore
	@Test (priority=20)
	public void newandfeaturedValiate() {
		HomePage obj=new HomePage(driver);
		lanuchbrowser("chrome");
		geturl("https://www.bestbuy.com");
		obj.allmenu().clickallmanu().newandfeatured().eastergiftideas().validatewebsite();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
