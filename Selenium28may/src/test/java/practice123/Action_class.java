package practice123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code_p.P_base_class;

public class Action_class extends P_base_class {

	public static void main(String[] args) throws Throwable  {
		
		Launch_browser("Chrome");
		screenshot("Browser launch");
		Hiturl("https://jqueryui.com/");
		Actions act= new Actions(drive);
		//WebElement dragable = drive.findElement(By.xpath("//a[text()=\"Draggable\"]"));
		//act.moveToElement(dragable).click().build().perform();
		//System.out.println("Web page title after dragable page is : "+drive.getTitle());
		//WebElement Themes = drive.findElement(By.xpath("//a[text()=\"Themes\"]"));
		//act.moveToElement(Themes).doubleClick().build().perform();
		
		JavascriptExecutor JS= (JavascriptExecutor) drive;
		JS.executeScript("window.scrollBy(0,200)");
		WebElement slider = drive.findElement(By.xpath("//a[text()=\"Slider\"]"));
		slider.click();
		WebElement slider_frame = drive.findElement(By.cssSelector("iframe.demo-frame"));
		Thread.sleep(3000);
		drive.switchTo().frame(slider_frame);
		WebElement slider_button = drive.findElement(By.cssSelector("span.ui-slider-handle.ui-corner-all.ui-state-default"));
		Thread.sleep(3000);
		act.moveToElement(slider_button).dragAndDropBy(slider_button, 400, 0).build().perform(); 
		Thread.sleep(3000);
		act.moveToElement(slider_button).dragAndDropBy(slider_button, -200, 0).build().perform();
		
		drive.switchTo().defaultContent();
		
		WebElement Droppable = drive.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		Droppable.click();
		WebElement dropable_frame = drive.findElement(By.cssSelector("iframe.demo-frame"));
		drive.switchTo().frame(dropable_frame);
		WebElement drag_to_target = drive.findElement(By.xpath("//p[text()=\"Drag me to my target\"]"));
		WebElement target_drop = drive.findElement(By.xpath("//p[text()=\"Drop here\"]"));
		//act.moveToElement(drag_to_target).clickAndHold(target_drop).release().build().perform();
		act.dragAndDrop(drag_to_target, target_drop).build().perform();
		
		
	}

}
