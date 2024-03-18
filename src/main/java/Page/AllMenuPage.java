package Page;

import org.openqa.selenium.WebDriver;

import Base.ProjectSpecification;

public class AllMenuPage extends ProjectSpecification{
	
	
	public AllMenuPage(WebDriver driver) {
	
		
		this.driver=driver;
	}
	
	
	public AllMenuPage clickallmanu() {
		
		click("xpath", "//button[@aria-label='Menu']");
		return this;
		
	}
	
	public AllMenuPage deal() {
		click("xpath", "//button[@data-id='node-29']");
		return this;
	}
	
	public AllMenuPage topdeal() {
		click("xpath", "(//a[@data-t='header-navigation-anchor'])[1]");
		return this;
	}
	
	public  AllMenuPage validatewebsite() {
		
	     if(driver.getTitle() == null||driver.getTitle().isEmpty()) {
				
				System.out.println("URL is broken or unreachable");
			}else {
				System.out.println("URL is reachable and valid");
			}
	     
	    closeBrowser();
	     return this;
			
		}
	
	public AllMenuPage supportservice(){
		
		click("xpath", "//button[@data-id='node-61']");
		return this;
		
	}
	
	public AllMenuPage vistsupportcenter(){
		
		click("xpath", "(//a[@class='hamburger-menu-flyout-list-item  '])[1]");
		return this;
		
	}
	
	public AllMenuPage brands() {
		
		click("xpath", "//button[@data-id='node-81']");
		return this;
		
	}
	
	public AllMenuPage Apple() {
		click("xpath", "(//a[@data-t='header-navigation-anchor'])[1]");
		return this;
		
	}
	
	public AllMenuPage appliance() {
		click("xpath", "//*[@data-lid='ubr_app']");
		return this;
		
	}
	
	public AllMenuPage kitchanappliance() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public AllMenuPage tvandhometheater() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[5]");
		return this;
		
	}
	
	
	public AllMenuPage tvssize() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public AllMenuPage toptvdeal() {
		
		click("xpath", "//*[@data-lid='ubr_tv_sz_toptv']");
		return this;
		
	}
	
	public AllMenuPage computerandtablet() {
		
		click("xpath", "(//*[@data-t='header-navigation-button'])[6]");
		return this;
		
	}
	
	public AllMenuPage laptopanddesktop() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
	}
	
	public AllMenuPage laptop() {
		click("xpath", "//*[@data-lid='ubr_cp_ld_lnb']");
		return this;
	}
	
	public AllMenuPage cellphone() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[7]");
		return this;
		
	}
	
	public AllMenuPage unlockphone() {
		click("xpath", "(//*[@data-t='header-navigation-anchor'])[1]");
		return this;
		
	}
	
	public AllMenuPage audio() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[8]");
		return this;
		
	}	
	
	public AllMenuPage homeAudio() {
		click("xpath","(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}	
	
	public AllMenuPage speaker() {
		click("xpath","//*[@data-lid='ubr_au_ha_spk']");
		return this;
		
	}
	
	
	public AllMenuPage videoGame() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[9]");
		return this;
		
	}	
	
	public AllMenuPage xboxseries() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	
	public AllMenuPage xboxseriesconsole() {
		click("xpath", "(//*[@data-t='header-navigation-anchor'])[1]");
		return this;
		
	}
	
	public AllMenuPage cameras() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[10]");
		return this;
		
	}	
	
	public AllMenuPage camerasandlenses() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public AllMenuPage topcameradeal() {
		click("xpath", "//*[@data-lid='ubr_cc_cl_td_tcd']");
		return this;
		
	}
	
	public AllMenuPage homefurniture() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[11]");
		return this;
		
	}
	
	
	public AllMenuPage home() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[1]");
		return this;
		
	}
	
	public AllMenuPage appliances() {
		click("xpath", "//*[@data-lid='ubr_hof_home_app']");
		return this;
		
	}
	
	public AllMenuPage smarthome() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[12]");
		return this;
		
	}
	
	public AllMenuPage wifiandnetwork() {
		click("xpath", "//*[@data-id='node-742']");
		return this;
		
	}
	
	
	public AllMenuPage router() {
		click("xpath", "//*[@data-lid='ubr_sh_net_rou']");
		return this;
		
	}
	
	public AllMenuPage carelectronics() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[13]");
		return this;
		
	}
	
	public AllMenuPage caraudio() {
		click("xpath", "//*[@data-id='node-784']");
		return this;
		
	}
	
	public AllMenuPage carstrero() {
		click("xpath", "//*[@data-lid='ubr_car_cau_rec']");
		return this;
		
	}
	
	public AllMenuPage movieandmusic() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[14]");
		return this;
		
	}
	
	public AllMenuPage movieandtvshow() {
		click("xpath", "//*[@data-id='node-819']");
		return this;
		
	}
	
	
	public AllMenuPage movieandtvshowpreordeer() {
		click("xpath", "//*[@data-lid='ubr_mm_mov_mopre']");
		return this;
		
	}
	
	public AllMenuPage wearable() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[15]");
		return this;
		
	}
	
	
	public AllMenuPage applewatch() {
		click("xpath", "//*[@data-lid='ubr_wt_apw']");
		return this;
		
	}
	
	public AllMenuPage applewatchultra2() {
		click("xpath", "//*[@data-lid='ubr_wt_apw_apple_watch_ultra']");
		return this;
		
	}
	
	public AllMenuPage healthandwelness() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[16]");
		return this;
		
	}
	
	public AllMenuPage homehealthcar() {
		click("xpath", "//*[@data-id='node-924']");
		return this;
		
	}
	
	public AllMenuPage bloodpressure() {
		click("xpath", "//*[@data-lid='ubr_hw_health_blood_pressure_monitors']");
		return this;
		
	}
	
	public AllMenuPage outdoorandliving() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[17]");
		return this;
		
	}
	
	public AllMenuPage patiofurniture() {
		click("xpath", "//*[@data-id='node-1011']");
		return this;
		
	}
	
	public AllMenuPage patiodiningset() {
		click("xpath", "//*[@data-lid='ubr_out_pfd_patio_dining_sets']");
		return this;
		
	}
	
	public AllMenuPage toyandgamescollection() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[18]");
		return this;
		
	}
	
	public AllMenuPage toytype() {
		click("xpath", "//*[@data-id='node-1064']");
		return this;
		
	}
	
	
	public AllMenuPage toyguide() {
		click("xpath", "//*[@data-lid='ubr_tg_type_toy_guide']");
		return this;
		
	}
	
	public AllMenuPage electricandtransportation() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[19]");
		return this;
		
	}

	
	public AllMenuPage electricbike() {
		click("xpath", "//*[@data-id='node-1124']");
		return this;
		
	}
	
	public AllMenuPage stepthrowelectricbike() {
		click("xpath", "//*[@data-lid='ubr_etrans_ebike_step_through_electric_bike']");
		return this;
		
	}
	
	public AllMenuPage newandfeatured() {
		click("xpath", "(//*[@data-t='header-navigation-button'])[20]");
		return this;
		
	}
	
	public AllMenuPage eastergiftideas() {
		click("xpath", "//*[@data-lid='ubr_ftr_easter_gifts']");
		return this;
		
	}
	
	
	
	
	
	

}
