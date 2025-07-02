package practice123;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dynamic_code_p.P_base_class;

public class Screenshot extends P_base_class {
	
public static void main(String[] args) throws Throwable {
		
		Launch_browser("chrome");
		Hiturl("https://www.snapdeal.com/");
		/*
		TakesScreenshot ts= (TakesScreenshot) drive;
		File pickup = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Evidance/browser_launched.png");
		org.openqa.selenium.io.FileHandler.copy(pickup, destination);
		*/
		/*
		screenshot("Webpage snapdeal");
		JavascriptExecutor JS= (JavascriptExecutor) drive;
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		JS.executeScript("window.history.go(0)");
		*/
		screenshot("snapdeal_webpage1");
		/*TakesScreenshot ts= (TakesScreenshot) drive;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File("./Screenshot/snapdeal/snapdeal_webpage.png");
		org.openqa.selenium.io.FileHandler.copy(source, target);
		*/
	}

}
