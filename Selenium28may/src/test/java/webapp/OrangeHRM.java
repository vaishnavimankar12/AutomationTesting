package webapp;

import dynamic_code.Base_class;

public class OrangeHRM extends Base_class {

	public static void main(String[] args) throws Throwable {

		Launchbrowser("edge");
		//d.get("https://opensource-demo.orangehrmlive.com/");
		HitURL("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		d.close();
		Launchbrowser("chrome");
		//d.get("https://opensource-demo.orangehrmlive.com/");
		HitURL("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		d.close();
		Launchbrowser("chrome");
		HitURL("https://www.naukri.com/");
		d.close();
	}

}
