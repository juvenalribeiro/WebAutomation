package pages;

import support.CoreQA;

/*
 * This class implements all the necessary methods of interaction with the main search page Senta Home Page
 */

public class SentaHomePage {

	private CoreQA driver;

	public SentaHomePage(CoreQA stepDriver) {
		driver = stepDriver;
	}

	public void openSentaHomePage() {
		driver.openURL("https://hitachiconsulting.sharepoint.com/sites/home");
	}

	public void sentaHomeVerifiction() {
		driver.isDisplayed("O365_MainLink_TenantLogo", "id");
	}

	public void openHubNavOption(String option) {
		driver.isDisplayed("//a[contains(text(),'" + option + "')]", "xpath");

		driver.click("//a[contains(text(),'" + option + "')]", "xpath");

	}

}
