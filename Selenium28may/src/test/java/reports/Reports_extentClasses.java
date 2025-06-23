

package reports;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports_extentClasses  extends Base_class{
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {

		// extent spark reporter is the class is used to configure or set the title
		// name, report name and theme name.
		ExtentSparkReporter Esr = new ExtentSparkReporter(projectpath + "\\Reports\\Amazon_Report\\");

		Esr.config().setDocumentTitle("Amazon Reports Title");

		Esr.config().setReportName("Amazon reports");

		Esr.config().setTheme(Theme.STANDARD);

		// extent report is the class is used to set the system configuration.
		ExtentReports Er = new ExtentReports();

		Er.attachReporter(Esr);

		Er.setSystemInfo("Software", "Eclipse");
		Er.setSystemInfo("Testing", "Automation");
		Er.setSystemInfo("Language", "Java");
		Er.setSystemInfo("Tool", "Selenium");
		Er.setSystemInfo("Website", "Amazon");
		/*Er.setSystemInfo("Url", "amazon");
		Er.setSystemInfo("package", "reports");
		Er.setSystemInfo("class", "Reports_extentClasses");
		Er.setSystemInfo("Folder", "Reports");*/
		
		//extent test is the class is used to create test cases.
		
		ExtentTest Et = Er.createTest("clicked on search");
		d.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).click();

		Et.log(Status.INFO,"Test cases infor");

		ExtentTest Et1 = Er.createTest(" passed text cases");

		Et1.log(Status.PASS,"Test cases passed");
		
		ExtentTest Et2 = Er.createTest("Failed text cases");

		Et2.log(Status.FAIL, "Test cases failed");
		
		ExtentTest Et3 = Er.createTest("Skipped text cases");

		Et3.log(Status.SKIP, "Test cases skipped");
		
		Launchbrowser("chrome");
		
		HitURL("https://www.amazon.in/");
		
		Er.flush();
		

	}

}

