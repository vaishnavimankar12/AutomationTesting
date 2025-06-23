package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Dropdown  extends Base_class{

	public static void main(String[] args) {

		Launchbrowser("Chrome");
		HitURL("https://www.selenium.dev/selenium/web/web-form.html");

		//WebElement dropdown = d.findElement(By.xpath("//option[@value=\"San Francisco\"]"));
		//dropdown.click();
				
		//List<WebElement> datalist = d.findElements(By.xpath("(//datalist[@id=\\\"my-options\\\"]//child::option)[1]"));
		
		// //datalist[@id=\\\"my-options\\\"]//child::option)[1]

		//  //input[@placeholder="Type to search..."]
		
		WebElement datalist1 = d.findElement(By.xpath("//input[@placeholder=\"Type to search...\"]"));
		datalist1.click();
		datalist1.sendKeys("San Francisco");
		
		
		//List<WebElement> data = d.findElements(By.xpath("//datalist[@id=\\\\\\\"my-options\\\\\\\"]//child::option"));
		//System.out.println(data.size());
		
		List<WebElement> data1 = d.findElements(By.xpath("//datalist[@id=\"my-options\"]//child::option"));
		System.out.println("size = "+data1.size());

		
		for(int i=0;i<data1.size();i++)
		{
			if(data1.get(i).getText().contains("Los Angeles"))
			{
			data1.get(i).click();
			break;
			}
		
		}
	}

}
