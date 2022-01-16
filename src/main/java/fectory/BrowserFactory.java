package fectory;

import helper.CommonMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserFactory extends CommonMethod {
    ApplicationPropertiesLoader load_property = new ApplicationPropertiesLoader();
    String browserName = load_property.getProperty("browser");

    public void browser_Selector() {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge browser")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("In correct browser name or empty" + browserName);
        }
        //maximize browser
        driver.manage().window().maximize();
        // implicitlyWait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);






    }
}
