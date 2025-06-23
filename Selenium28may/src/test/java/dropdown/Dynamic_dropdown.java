package dropdown;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Dynamic_dropdown extends Base_class {

	public static void main(String[] args) throws Throwable {
		Launchbrowser("Chrome");
		HitURL("https://www.railyatri.in/");

		javascriptexecutor("Scroll");
		
		Thread.sleep(3000);
		WebElement from = d.findElement(By.xpath(""));
		from.click();
		from.sendKeys("nagp");
		
		List<WebElement> from1 = d.findElements(By.xpath(""));
		System.out.println("size : "+from1.size());
		for(int i=0;i<from1.size();i++) {
			if(from1.get(i).getText().equalsIgnoreCase("NAGPUR | NGP")) {
				from1.get(i).click();
				break;
			}
		}
	}

}
