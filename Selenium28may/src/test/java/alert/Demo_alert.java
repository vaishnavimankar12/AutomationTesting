package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;


public class Demo_alert extends Base_class {
	
	
	public static void Alert1() throws Throwable {
		Launchbrowser("chrome");
		HitURL("https://demoqa.com/alerts");

		// javascriptexecutor("window.scrollBy(0,150)\r\n");
		// window.scrollBy(0,150)

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);

		WebElement simple_click = d.findElement(By.xpath("(//button[text()=\"Click me\"])[1]"));
		simple_click.click();
		Thread.sleep(3000);
		Alert SC = d.switchTo().alert();
		System.out.println("Alert1 text : "+SC.getText());
		Thread.sleep(3000);
		SC.accept();
	}

	public static void Alert2() throws Throwable
	{
	
		WebElement simple_click = d.findElement(By.xpath("(//button[text()=\"Click me\"])[2]"));
		simple_click.click();
		Alert SC = d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert2 text : "+SC.getText());
		SC.accept();
	}
	
	public static void Alert3() throws Throwable
	{
		WebElement simple_click = d.findElement(By.xpath("(//button[text()=\"Click me\"])[3]"));
		simple_click.click();
		
		Alert SC = d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert3 text : "+SC.getText());
		SC.dismiss();
	}
	
	
	public static void Alert4() throws Throwable
	{
		WebElement simple_click = d.findElement(By.xpath("(//button[text()=\"Click me\"])[4]"));
		simple_click.click();
		Thread.sleep(3000);
		Alert SC = d.switchTo().alert();
		SC.sendKeys("Good morning");
		System.out.println("Alert4 text : "+SC.getText());
		SC.accept();
	}
	
	public static void demosite() throws Throwable
	{
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
	public static void main(String[] args) throws Throwable{

		Alert1();
		//Alert2();
		Alert3();
		Alert4();
		demosite();
	}

}
