package pages;

import support.CoreQA;

/*
 * This class implements all the necessary methods of interaction with the main search page My Application Page
 */

public class MyApplicationPage {
	private CoreQA driver;

	public MyApplicationPage(CoreQA stepDriver) {
		driver = stepDriver;
	}

	public void openApplication(String application) {
		driver.isDisplayed("//div[contains(text(),'" + application + "')]", "xpath");
		driver.click("//div[contains(text(),'" + application + "')]", "xpath");
	}

}
