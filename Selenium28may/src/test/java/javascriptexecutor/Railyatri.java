package javascriptexecutor;

import java.awt.desktop.ScreenSleepListener;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import dynamic_code.Base_class;
import screenshot.Screenshots;

public class Railyatri extends Base_class{

	public static void main(String[] args) throws Throwable {

		Launchbrowser("Chrome");
		HitURL("https://www.railyatri.in/");
		
		JavascriptExecutor j= (JavascriptExecutor) d;
		j.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		TakeScreenShot("railyatri");
		
		j.executeScript("window.history.go(0)");
		Thread.sleep(3000);
		TakeScreenShot("scrolldown");
		
		j.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		
		j.executeScript("window.history.back()");
		Thread.sleep(3000);
		TakeScreenShot("back");
		
		j.executeScript("window.history.forward(0)");
		Thread.sleep(3000);
		TakeScreenShot("forward");
		d.close();

	}

}
