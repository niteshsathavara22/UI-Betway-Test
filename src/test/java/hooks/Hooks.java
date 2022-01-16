package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import fectory.BrowserFactory;
import helper.CommonMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Hooks extends CommonMethod {
    BrowserFactory browserFactory=new BrowserFactory();

    @Before
    public void OpenBrowser() {
        //open browser
        browserFactory.browser_Selector();
        driver.get("https://www.bbc.co.uk/sport/football/scores-fixtures");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser() {
        //close browser
         driver.quit();
    }

}
