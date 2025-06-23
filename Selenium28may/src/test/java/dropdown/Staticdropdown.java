package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dynamic_code.Base_class;

public class Staticdropdown extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("Chrome");
		HitURL("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1%22);");

		WebElement profile = d.findElement(By.xpath("//select[@id=\"reg_relationship\"]"));
		profile.click();

		Select select = new Select(profile);
		select.selectByVisibleText("Sibling");

		WebElement s1 = d.findElement(By.cssSelector("select[id=\"reg_dtofbirth_day\"]"));
		s1.click();
		Select DATE = new Select(s1);
		DATE.selectByValue("12");

		Thread.sleep(3000);
		WebElement s2 = d.findElement(By.cssSelector("select[id=\"reg_dtofbirth_month\"]"));
		s2.click();
		Select MONTH = new Select(s2);
		MONTH.selectByIndex(10);

	}
}
