package practice123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code_p.P_base_class;

public class Amazon extends P_base_class {
	public static void main(String[] args) throws Throwable {

		Launch_browser("chrome");
		drive.get("https://www.amazon.in/");
		screenshot("amazon");
		WebElement searchbox = drive.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchbox.click();
		screenshot("click");
		searchbox.sendKeys("iphone16 pro max");
		screenshot("iphone");
		System.out.println(searchbox.getAttribute("value"));
		drive.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		screenshot("iphpone results");
		System.out.println("Title of makeup wepage : " + drive.getTitle());
		drive.findElement(By.xpath("//div[@class=\"_c2Itd_videoOverlay_1H_Jm\"]")).click();

	}

}
