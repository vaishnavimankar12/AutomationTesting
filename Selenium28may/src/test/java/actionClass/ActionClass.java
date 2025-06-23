package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class ActionClass extends Base_class
{

	public static void main(String[] args) throws Throwable {
		
		Launchbrowser("Chrome");
		HitURL("https://www.amazon.in/");
		Actions act= new Actions(d);
		WebElement TD= d.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		act.moveToElement(TD).perform();
		
		//act.moveToElement(TD).click().build().perform();
		
		act.moveToElement(TD).contextClick().build().perform();
		
		WebElement searchbox= d.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchbox.click();
		Thread.sleep(3000);
		act.click().sendKeys("Iphone 16").doubleClick().build().perform();
		TakeScreenShot("Searchbox");
		
		//keyboard actions
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		act.keyDown (Keys.PAGE_DOWN).build().perform();

	}

}
