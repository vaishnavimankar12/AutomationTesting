package practice123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		// WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(null));
		System.out.println(driver.getTitle());
		// driver.close();
		driver.findElement(By.id("category1Data"));
		driver.findElement(By.className("greyTemplateDiv"));
		driver.findElement(By.linkText("Toys, Kids' Fashion & more"));
		driver.findElement(By.partialLinkText("Toys, Kids'"));
		// driver.findElement(By.tagName("Tagname_name"));
		// tagname#idvalue
		driver.findElement(By.cssSelector("input#isHelpCenterUberExperienceSwitchEnabled"));
		// tagname.classvalue
		driver.findElement(By.cssSelector("div.comp-header.reset-padding"));
		// tagname[attribute="attributevalue"]
		driver.findElement(By.cssSelector("div[class=\"comp-header reset-padding\"]"));
		// contains= tagname[attribute*="Attributevalue"]
		driver.findElement(By.cssSelector("div[class*=header-exchange-exce]"));
		// Startswith= tagname[attribute^="Attributevalue"]
		driver.findElement(By.cssSelector("div[class^=\"header-exchange-exce\"]"));
		// endswith= tagname[attribute$="Attributevalue"]
		driver.findElement(By.cssSelector("div#leftNavMenuRevamp"));
		// pseudoclasses
		// tagname[attribute="Attributevalue"] :first-child
		// tagname[attribute="Attributevalue"] :last-child
		// tagname[attribute="Attributevalue"] :nth-last-child(number)
		// tagname[attribute="Attributevalue"] :nth-child(number)

		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :first-child"));
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :last-child"));
		driver.findElement(By.cssSelector("select[id=\"searchDropdownBox\"] :nth-child(10)"));

		// xpath
		// single attribute
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_hi\"]"));
		// multiple attribute
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_hi\"][@class=\"nav-a  \"]"));
		// and operator
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_hi\" and @class=\"nav-a  \"]"));
		// or operator
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_hi\" or @class=\"nav-a \"]"));
		// text
		driver.findElement(By.xpath("//a[text()=\"Buy Again\"]"));
		// parent
		driver.findElement(By.xpath("//option[@value=\"search-alias=aps\"]//parent::select"));
		// self
		driver.findElement(By.xpath("//option[@value=\"search-alias=aps\"]//self::option"));
		// child
		driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]//child::option"));

	}

}
