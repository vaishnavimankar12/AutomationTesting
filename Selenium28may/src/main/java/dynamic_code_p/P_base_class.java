package dynamic_code_p;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P_base_class {
	
	public static WebDriver drive;

	public static void Launch_browser(String browsers)
	{
		if(browsers.equalsIgnoreCase("chrome"))
		{
			 drive= new ChromeDriver();
		}
		else if(browsers.equalsIgnoreCase("edge"))
		{
			 drive= new EdgeDriver();
		}
		System.out.println("Launched browser is "+browsers);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}

	public static void Hiturl(String URL) {
		drive.get(URL);
		System.out.println("Title of webpage : "+drive.getTitle());
	}
	
	public static void screenshot(String SS) throws Throwable  {
		
		TakesScreenshot ts= (TakesScreenshot) drive;
		File pickup = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/"+SS+".png");
		org.openqa.selenium.io.FileHandler.copy(pickup, destination);
	
		}

}
