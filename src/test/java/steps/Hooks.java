package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import support.BaseSteps;
import support.CoreQA;

import org.openqa.selenium.TakesScreenshot;

import static org.openqa.selenium.OutputType.BYTES;
/*
 * This class is the definition of the after and before step to execute a scenario
 */

public class Hooks extends BaseSteps {
	private static Scenario scenario;
	private static CoreQA driver;

	@Before
	public void beforeScenario(Scenario scenario) {
		setScenario(scenario);
		System.out.println("--- Starting scenario " + scenario.getName() + " execution ---");
		
	}

	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("\n--- Scenario " + scenario.getName() + " executed ---");

		if (scenario.isFailed()) {
			printScenario();
		}
	}

	public static Scenario getScenario() {
		return scenario;
	}

	public static void setScenario(Scenario scen) {
		scenario = scen;
	}

	private static void printScenario() {
		getScenario().write("url: " + driver.getCurrentUrl());
		TakesScreenshot camera = driver.getCamera();
		byte[] screenshot = camera.getScreenshotAs(BYTES);
		getScenario().embed(screenshot, "image/png");
	}

	public static void printSteps() {
		printScenario();
	}
}
