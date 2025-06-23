package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		
		
		Thread.sleep(3000);
		// d is refvariable
		d.manage().window().maximize();

		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//WebDriverWait
		WebDriverWait w= new WebDriverWait(d,Duration.ofSeconds(20));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		//fluentwait
		//pollingevery mdhe ajun wait deu shkto
		FluentWait<WebDriver> wait1= new  FluentWait<WebDriver>
		(d).withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		
		//thread.sleep deliberately stop krto wait
		
		Thread.sleep(300);
	}

}
