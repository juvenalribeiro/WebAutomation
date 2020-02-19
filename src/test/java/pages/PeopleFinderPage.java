package pages;

import org.junit.Assert;
import support.CoreQA;
/*
 * This class implements all the necessary methods of interaction with the main search page People Finder
 */
public class PeopleFinderPage {
	private CoreQA driver;

	public PeopleFinderPage(CoreQA stepDriver) {
		driver = stepDriver;
	}

	public void checkPageLoad() {
		driver.changeLabel();
		driver.isDisplayed("//span[contains(text(),'HCC People Finder')]", "xpath");
	}

	public void fillNameField(String name) {
		driver.isDisplayed("inpFullName", "id");
		driver.sendKeys(name, "inpFullName", "id");
	}

	public void resultNameValidation(String name) {
		driver.click("Submit1", "id");
		try {
		String nameFound = driver.getText("//a[contains(text(),'" + name + "')]", "xpath");
		Assert.assertEquals("the name was not found", name, nameFound);
		} catch (Error error) {
			Assert.fail("The name was not found on results!");
		}
	}

}
