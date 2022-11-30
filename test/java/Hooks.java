import CommonPages.BrowserSelector;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    // Create object for Browserselector class
    BrowserSelector browserSelector = new BrowserSelector();


    @Before
    public void openBrowser() {
        browserSelector.openSelectedBrowser();


    }

    @After
    public void closeBrowser() {

    }
}