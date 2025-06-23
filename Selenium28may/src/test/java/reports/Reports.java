package reports;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports  extends Base_class{

	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {

		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\reports\\GeneratedReport\\");
		Esr.config().setDocumentTitle("Automation Report");
		Esr.config().setReportName("Testing Report");
		Esr.config().setTheme(Theme.STANDARD);

		ExtentReports Er= new ExtentReports();
		Er.attachReporter(Esr);
		Er.setSystemInfo("OS", "Window");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Domain", "Ecommerce Domain");
		Er.setSystemInfo("Application", "Amazon");
		Er.setSystemInfo("Client", "Amazonclient");
		Er.setSystemInfo("QA", "Vaishnavi Mankar");
		
		
		//extent test it creates the test case
		ExtentTest ET= Er.createTest("Amazon URl");
		ET.log(Status.INFO, "Hit Amazon URL");
		
		ExtentTest ET1= Er.createTest("Search funtionality");
		ET.log(Status.PASS, "Test Pass");
		
		ExtentTest ET2= Er.createTest("Send data");
		ET.log(Status.FAIL, "Test Fail");
		
		ExtentTest ET3= Er.createTest("Clicked on search button");
		ET.log(Status.SKIP, "Amazon URL");
		
		
		Launchbrowser("Chrome");
		HitURL("https://www.amazon.in/");
		
		d.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).click();
		Er.flush();
		
	}

}
