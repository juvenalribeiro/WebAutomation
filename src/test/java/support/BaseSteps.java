package support;

public class BaseSteps {
	/*
	 * This class runs driver creation in desired browser
	 */
    protected static CoreQA driver = new CoreQA();

    public BaseSteps(){
        driver.start("chrome");
    }

}
