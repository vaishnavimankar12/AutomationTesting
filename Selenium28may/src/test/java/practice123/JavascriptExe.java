package practice123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import dynamic_code_p.P_base_class;

public class JavascriptExe extends P_base_class {
	public static void main(String[] args) throws Throwable {

		Launch_browser("chrome");
		Hiturl("https://www.snapdeal.com/");
		/*
		 * TakesScreenshot ts= (TakesScreenshot) drive; File pickup =
		 * ts.getScreenshotAs(OutputType.FILE); File destination = new
		 * File("./Evidance/browser_launched.png");
		 * org.openqa.selenium.io.FileHandler.copy(pickup, destination);
		 */
		Thread.sleep(3000);
		drive.findElement(By.xpath("//button[text()=\"NOT NOW\"]")).click();
		screenshot("Webpage snapdeal");
		JavascriptExecutor JS = (JavascriptExecutor) drive;

		JS.executeScript("window.history.go(0)");
		JS.executeScript("window.scrollBy(0,450)");
		Thread.sleep(5000);
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//
		
		

	}
}
