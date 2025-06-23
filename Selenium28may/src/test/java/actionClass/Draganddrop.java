package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Draganddrop extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("Chrome");
		HitURL("https://jqueryui.com/droppable/");

		WebElement abc = d.findElement(By.cssSelector("iframe.demo-frame"));
		d.switchTo().frame(abc);

		Actions act = new Actions(d);
		WebElement drag = d.findElement(By.cssSelector("div#draggable"));
		WebElement drop = d.findElement(By.cssSelector("div#droppable"));

		act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		act.clickAndHold(drag).moveToElement(drop).release().build().perform();
		act.dragAndDrop(drag, drop).release().build().perform();

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();

	}

}
