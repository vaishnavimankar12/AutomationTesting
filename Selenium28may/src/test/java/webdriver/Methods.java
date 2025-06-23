package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {

		WebDriver d1= new ChromeDriver();
		
		d1.manage().window().maximize();
		//Get URL- navigate to URL
		d1.get("https://www.amazon.in/");
		
		//GetTitle- to capture title
		d1.getTitle();
		
		//getcurrentURL- capture current URL
		d1.getCurrentUrl();
		
		//getpagesource - HTML source code
		d1.getPageSource();
		
		//findelement locators- to find one web element on page
		d1.findElement(null);
		
		//findelements locators- to find multiple web elements on page
		d1.findElements(null);
		
		//close- to close single tab
		d1.close();
		
		//quite to close all tabs
		d1.quit();
		
		//getwindowHandle- to get window ID ##Alphanumeric
		d1.getWindowHandle();
		
		//getwindowHandles - to get multiple window ID's
		d1.getWindowHandles();
		
		//SwitchTo- switch from one window to another window
		//Switch to  frame
		d1.switchTo();
		d1.switchTo().frame(0);
		
		//Navigate - to use If its navigate or to refresh or back or forward
		d1.navigate();
		
		//Manage -to manage windows, time- performs various options
		d1.manage();
		
		
	}

}
