package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class prac  extends Base_class{

	
	public static void main(String[] args) {
		
		Launchbrowser("Chrome");
		HitURL("https://www.amazon.in/");
		
	
		//
		WebElement searchbox = d.findElement(By.name("field-keywords"));
		searchbox.click();
	
	}
}
