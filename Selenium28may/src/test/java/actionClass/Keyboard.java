package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class Keyboard extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("Chrome");
		HitURL("https://www.jeevansathi.com/");

		WebElement email = d.findElement(By.cssSelector("input#email"));

		Actions act = new Actions(d);

		act.moveToElement(email).click().sendKeys("Vaishnavi mankar").build().perform();
		Thread.sleep(3000);

		// keyboard actions

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);

		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(3000);

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

		d.findElement(By.cssSelector("div#eye")).click();

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);

		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);

	}

}
