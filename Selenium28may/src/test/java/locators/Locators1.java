package locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {

		WebDriver d1 = new ChromeDriver();

		d1.manage().window().maximize();

		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		d1.get("https://www.amazon.in/");

		// id
		d1.findElement(By.id("nav-flyout-iss-anchor"));

		d1.findElement(By.id("nav-belt-search"));

		d1.findElement(By.id("nav-subnav-toaster"));

		d1.findElement(By.id("nav-progressive-subnav"));

		d1.findElement(By.id("nav_youraccount_btn"));

		// Name

		d1.findElement(By.name("site-search"));
		d1.findElement(By.name("a-aui_72554-c a-aui_a11y_6_837773-c a-aui_killswitch_csa_logger_372963-t1 a-aui_template_weblab_cache_33 3406-c a-bw_aui_cxc_alert_measurement_1074111-c a-bw_aui_switch_redesign_measurement_1206055-t1 a-meter-animate"));
		d1.findElement(By.name("twitter:card"));
		
		//classname

		d1.findElement(By.className("twitter:card"));
		
		// Linktext

		d1.findElement(By.linkText("Buy Again"));

		d1.findElement(By.linkText("Gift Ideas"));

		// partial linktext

		d1.findElement(By.partialLinkText("Today"));

		// tagname

		d1.findElements(By.tagName("meta")); //just as ex

		// CSS-selector

		// 1. tagname and id value -tagname#idvalue

		d1.findElement(By.cssSelector("div#navFooter"));

		d1.findElement(By.cssSelector("div#pageContent"));

		// 2. tagname and class value -tagname.classvalue
		// if space is their then remove space and insert dot(.)
		d1.findElement(By.cssSelector("div.navLeftFooter.nav-sprite-v1"));
		d1.findElement(By.cssSelector("div.navFooterLine.navFooterLinkLine.navFooterPadItemLine.navFooterCopyright"));
		d1.findElement(By.cssSelector("div.a-section.a-spacing-none.aok-relative.tall.gw-desktop-herotator-ready"));

		// 3. tagname and attribute- tagname[attribute="attributevalue"]
		d1.findElement(By.cssSelector("div[class=\"nav-ewc-lazy-align nav-ewcFlyout nav-flyout nav-locked\"]"));

		// 4.tagname and multiple attribute-
		// tagname[attribute1="attributevalue1"][attribute2="attributevalue2"]

		d1.findElement(By.cssSelector("div[aria-modal=\"false\"][role=\"dialog\"][id=\"nav-flyout-searchAjax\"]"));
		d1.findElement(By.cssSelector(
				"ul[class=\"keyboard-shortcuts-list-container\"][aria-labelledby=\"nav-assist-shortcuts-heading\"]"));

		// 5. contains
		// tagname[attribute*="Value"]
		d1.findElement(By.cssSelector("ul[class*=\"keyboard-shortcuts-list-container\"]"));

		// 6. starts with
		// tagname[attribute^="Value"]
		d1.findElement(By.cssSelector("ul[class^=\"keybo\"]"));

		// 7. ends with
		// tagname[attribute$="Value"]
		d1.findElement(By.cssSelector("ul[class$=\"list-container\"]"));
		
		//8 Pseudoclass
		//first value: tagname[attribute="Value"] :first-child
		d1.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :first-child"));
		d1.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :last-child"));
		d1.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"] :nth-child(7)"));
		d1.findElement(By.cssSelector("select[data-nav-digest=\"ZobsQWY4pE2QbvgmMbposriahro=\"] :nth-child(4)"));

	}

}
