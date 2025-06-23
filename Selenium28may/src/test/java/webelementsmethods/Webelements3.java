package webelementsmethods;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webelements3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d1= new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d1.get("https://www.amazon.in/");
		System.out.println(d1.getTitle());
		
		
		WebElement searchbox= d1.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		searchbox.click();
		Thread.sleep(3000);
		
		searchbox.sendKeys("Iphone 16");
		Thread.sleep(3000);
		
		searchbox.clear();
		Thread.sleep(3000);
		
		searchbox.sendKeys("Books");
		Thread.sleep(3000);
		
		System.out.println("The X coordinate of searchbox is : "+searchbox.getLocation().x);
		System.out.println("The y coordinate of searchbox is : "+searchbox.getLocation().y);
		
		
		System.out.println("Size of search box is : "+searchbox.getSize());
		System.out.println("Tagname is : "+searchbox.getTagName());
		System.out.println(searchbox.isDisplayed());
		System.out.println(searchbox.isSelected());
		d1.navigate().refresh();
		Thread.sleep(3000);
		
		d1.navigate().back();
		Thread.sleep(3000);
		
		d1.navigate().forward();
		Thread.sleep(3000);
		
		d1.close();
		
		

	}

}
