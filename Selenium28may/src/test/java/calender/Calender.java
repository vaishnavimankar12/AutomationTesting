package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Calender extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("chrome");
		HitURL("https://www.railyatri.in/");

		Thread.sleep(3000);
		WebElement calender = d.findElement(By.xpath("//input[@id=\"datepicker_train\"]"));
		calender.click();

		WebElement month_year = d.findElement(By.xpath("//th[text()='June 2025']"));
		// month_year.click();

		System.out.println("The current month is : " + month_year.getText());

		WebElement date = d.findElement(By.xpath("(//td[text()='25'])[2]"));
		// date.click();
		System.out.println("The current date of this month is :" + calender.getAttribute("value"));
		Thread.sleep(3000);
		WebElement next = d.findElement(By.xpath("(//th[@style=\"visibility: visible;\"])[1]"));
		next.click();
		Thread.sleep(3000);
		next.click();

	}

}
