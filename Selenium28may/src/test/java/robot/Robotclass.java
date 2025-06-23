package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamic_code.Base_class;

public class Robotclass extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("Chrome");
		HitURL("https://www.ilovepdf.com/pdf_to_word");
		d.findElement(By.xpath("//span[text()=\"Select PDF file\"]")).click();

		StringSelection copy = new StringSelection("E:\\study\\STP\\sql\\SQL with MySQL - by STP Infotech");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);

		Robot r = new Robot();
		r.delay(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(3000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("//span[text()=\"Convert to WORD\"]")).click();
		d.findElement(By.xpath("//a[@id=\"pickfiles\"]")).click();

	}

}
