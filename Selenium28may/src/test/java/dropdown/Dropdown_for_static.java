package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Dropdown_for_static extends Base_class {

	public static void main(String[] args) {
		
		Launchbrowser("Chrome");
		HitURL("https://www.selenium.dev/selenium/web/web-form.html");
		WebElement select = d.findElement(By.cssSelector("select[class=\"form-select\"]"));
		select.click();
		
		List<WebElement> data = d.findElements(By.xpath("//select[@class=\"form-select\"]//child::option"));
		
		System.out.println("size : "+data.size());
		
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i).getText().contains("Three"));
			data.get(i).click();
		}
	}

}
