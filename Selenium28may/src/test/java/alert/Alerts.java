package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Alerts extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("chrome");
		HitURL("https://demo.automationtesting.in/Alerts.html");

		WebElement SA = d.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		SA.click();
		Alert OK_alert = d.switchTo().alert();
		System.out.println(OK_alert.getText());
		Thread.sleep(3000);
		OK_alert.accept();
		System.out.println("---------------------------------------------");
		
		WebElement CA = d.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel \"]"));
		CA.click();
		d.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
		Alert Conformation_alert = d.switchTo().alert();
		System.out.println(Conformation_alert.getText());
		Thread.sleep(3000);
		// to accept
		Conformation_alert.accept();
		WebElement textmsg = d.findElement(By.xpath("//p[@id=\"demo\"]"));
		System.out.println(textmsg.getText());
		System.out.println("---------------------------------------------");
		
		// to dismiss
		// Conformation_alert.dismiss();
		// WebElement textmsg1 = d.findElement(By.xpath("//p[@id=\"demo\"]"));
		// System.out.println(textmsg1.getText());

		WebElement PA = d.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]"));
		PA.click();
		d.findElement(By.xpath("//button[text()=\"click the button to demonstrate the prompt box \"]")).click();
		Alert Prompt_alert = d.switchTo().alert();
		System.out.println(Prompt_alert.getText());
		Thread.sleep(3000);
		Prompt_alert.sendKeys("Good morning");
		Prompt_alert.accept();
		
		

	}

}
