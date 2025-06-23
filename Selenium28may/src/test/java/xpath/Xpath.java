package xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize();

		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d1.get("https://www.amazon.in/");

		// single attribute
		d1.findElement(By.xpath("//a[@data-csa-c-id=\"fg7cqu-16r6s3-s2oxuc-ltxh28\"]"));

		// and Operator
		d1.findElement(By.xpath("//a[@data-csa-c-id=\"fg7cqu-16r6s3-s2oxuc-ltxh28\" and @tabindex=\"0\"]"));

		// or operator
		d1.findElement(By.xpath("//div[@aria-label=\"Primary\" or @data-cel-widget=\"Navigation-desktop-navbar\"]"));

		// multiple attribute
		d1.findElement(By.xpath("//a[@data-csa-c-id=\"fg7cqu-16r6s3-s2oxuc-ltxh28\"][@tabindex=\"0\"]"));

		// contains
		d1.findElement(By.xpath("//input[contains(@id,\"twotabsearchtextbox\")]"));

		// starts with
		d1.findElement(By.xpath("//input[starts-with(@id,\"twotab\")]"));

		// text
		d1.findElement(By.xpath("//a[text()=\"Home Improvement\"]"));

		d1.findElement(By.xpath("(//span[text()=\"Large Appliances\"])[2]"));
		
		
		//self
		d1.findElement(By.xpath("//option[@value=\"node=1380263031\"]//self::option"));
		//option[@value="node=1380263031"]//self::option

		//parent
		d1.findElement(By.xpath("//option[@value=\"node=1380263031\"]//parent::select"));
		
	}

}
