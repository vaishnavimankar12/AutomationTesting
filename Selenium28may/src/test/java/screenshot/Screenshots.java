package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Screenshots extends Base_class{

	public static void main(String[] args) throws Throwable {
		Launchbrowser("chrome");
		TakesScreenshot TS= (TakesScreenshot) d;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/amazon/Browser_launched.png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
	
		HitURL("https://www.amazon.in/");
		TakesScreenshot TS1= (TakesScreenshot) d;
		File source1 = TS.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./Screenshot/amazon/amazon.png");
		org.openqa.selenium.io.FileHandler.copy(source1, target1);
		
		WebElement searchbox= d.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchbox.click();
		searchbox.sendKeys("Iphone 16");
		TakesScreenshot TS2= (TakesScreenshot) d;
		File source2 = TS.getScreenshotAs(OutputType.FILE);
		File target2= new File("./Screenshot/amazon/iphone16.png");
		org.openqa.selenium.io.FileHandler.copy(source2, target2);
		
		
		searchbox.clear();
		Thread.sleep(3000);
		
	
		
	}

}
