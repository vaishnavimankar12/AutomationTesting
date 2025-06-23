package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.logging.FileHandler;

import javax.tools.JavaFileManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_class {

	public static WebDriver d;
	public static String projectpath=System.getProperty("User.dir");

	public static void Launchbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			d = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			d = new EdgeDriver();
		}

		System.out.println("The browser launch is as : " + browser);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static void HitURL(String URL) {
		d.get(URL);
		System.out.println("The title of webpage = "+d.getTitle());
	}
	
	public static void TakeScreenShot(String ScreenshotName) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot) d;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File target= new File("./Screenshot/"+ScreenshotName+ ".png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
		
	}
	
	public static void Screenshot_path(String SS_Name) throws Throwable
	{
		TakesScreenshot ts1=(TakesScreenshot) d;
		File source1= ts1.getScreenshotAs(OutputType.FILE);
		File target1= new File(projectpath+"\\railyatri\\"+SS_Name+ ".png");
		org.openqa.selenium.io.FileHandler.copy(source1, target1);
	}
	
	public static void javascriptexecutor(String Scroll) {
		JavascriptExecutor js= (JavascriptExecutor) d;
		js.executeScript("Scroll");
	}
	
}
