package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyApplicationPage;
import pages.PeopleFinderPage;
import pages.SentaHomePage;
import support.BaseSteps;
/*
 * This class implements the step definition for the Senta home feature.
 */

public class SentaHomePageStep extends BaseSteps {

	private static SentaHomePage sentaHomePage = new SentaHomePage(driver);
	private static MyApplicationPage myApplicationPage = new MyApplicationPage(driver);
	private static PeopleFinderPage peopleFinderPage = new PeopleFinderPage(driver);

	@Given("^that accessing the Senta homepage$")
	public void that_accessing_the_Senta_homepage() throws Throwable {
		sentaHomePage.openSentaHomePage();
	}

	@When("^the page is loaded$")
	public void the_page_is_loaded() throws Throwable {
		sentaHomePage.sentaHomeVerifiction();
	}

	@When("^click on \"([^\"]*)\" label on HubNav$")
	public void click_on(String arg1) throws Throwable {
		sentaHomePage.openHubNavOption(arg1);
	}

	@When("^open \"([^\"]*)\" application$")
	public void open_application(String arg1) throws Throwable {
		myApplicationPage.openApplication(arg1);
	}
	
	@When("^the People Finder is loaded$")
	public void the_People_Finder_is_loaded() throws Throwable {
		peopleFinderPage.checkPageLoad();
	}

	@When("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
		peopleFinderPage.fillNameField(arg1);
	}

	@Then("^name \"([^\"]*)\" is displyed on results$")
	public void is_displyed_on_results(String arg1) throws Throwable {
		peopleFinderPage.resultNameValidation(arg1);
	}
	
	
}
