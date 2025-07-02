package practice123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;
import dynamic_code_p.P_base_class;

public class Keyboard extends P_base_class {

	public static void main(String[] args) throws Throwable {
		
		Launch_browser("Chrome");
		screenshot("launched browser");
		Hiturl("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1%22);");
		Thread.sleep(3000);
		Actions act= new Actions(drive);
		WebElement email = drive.findElement(By.cssSelector("input#reg_email"));
		//act.moveToElement(email).click().sendKeys("Vaishnavimankar123@gmail.com").build().perform();
		email.click();
		email.sendKeys("Vaishnavimankar123@gmail.com");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		/*WebElement password = drive.findElement(By.cssSelector("input#reg_password"));
		act.moveToElement(password).click().sendKeys("qwert12345").build().perform();*/
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		
		
	}

}
