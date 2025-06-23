package reports;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Vikas {
      static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {
		
		//ExtentSparkReporter
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath+"\\Reports\\GeneratedReports\\");
		
		// Configuration set
		Esr.config().setDocumentTitle("Amazon Reports");
		Esr.config().setReportName("Automation Testing");
		Esr.config().setTheme(Theme.STANDARD);
		
		//Exten report
	     ExtentReports Er = new ExtentReports();
	     
	     Er.attachReporter(Esr);
	     
	     Er.setSystemInfo("Operating System", "Window");
	     Er.setSystemInfo("Browser", "Chrome");
	     Er.setSystemInfo("Domain", "E-Commerce");
	     Er.setSystemInfo("Application", "Amazon");
	     Er.setSystemInfo("WebElement", "Deals");
	     Er.setSystemInfo("Sendkeys", "Text");
	     Er.setSystemInfo("Button", "Enable");
	     Er.setSystemInfo("QA", "VIKAS");
	     
	     //Extent Test : It creat the test cases
	     
	    ExtentTest Et = Er.createTest("Hit url");
	    
	    Et.log(Status.INFO, "Amazon Url");
	    
	    ExtentTest Et1 = Er.createTest("Hit url");
	    Et1.log(Status.PASS, "Test Pass");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	   driver.get("https://www.amazon.in/");
	   
	   Er.flush();
	    
	   
	    
	    
	     
	     

	}

}
