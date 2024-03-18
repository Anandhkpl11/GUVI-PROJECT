package Utilizes;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBestBuy {
	
	
	public static ExtentReports GetReport() {
		
		String path="C:\\Users\\HAPPY\\Desktop\\GUVI Project\\BestBuyE-Commerce\\Reports\\BestBuyE-commerceReports.html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("BestBuyE-commerce Reports");
		
		
		ExtentReports extentreports=new ExtentReports();
		extentreports.attachReporter(report);
		
		return extentreports;
	}

}
