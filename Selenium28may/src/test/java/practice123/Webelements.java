package practice123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("Title of webpage : "+driver.getTitle());
		WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbox.click();
		Thread.sleep(3000);
		searchbox.sendKeys("Mobiles");
		Thread.sleep(3000);
		searchbox.clear();
		Thread.sleep(3000);
		searchbox.sendKeys("books");
		System.out.println(searchbox.getAttribute("value"));
		System.out.println("X coordinate : "+searchbox.getLocation().x);
		System.out.println("Y coordinate : "+searchbox.getLocation().y);
		System.out.println("Size of seachbox :" +searchbox.getSize());
		System.out.println(searchbox.getTagName());
		
		WebElement allelements = driver.findElement(By.xpath("//a[@aria-label=\"Open All Categories Menu\"]"));
		allelements.click();
		WebElement bestseller = driver.findElement(By.xpath("(//a[text()='Bestsellers'])[2]"));
		bestseller.click();
		

	}

}
