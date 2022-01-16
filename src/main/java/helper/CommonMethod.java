package helper;

import fectory.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class CommonMethod extends BasePage {

    public static void clickElement(By by) {
        driver.findElement(by).click();
        ;
    }

    public static void enterText(By by, String text) {
        // driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //method for wait webDriver use thread sleep
    public static void thread_Sleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void clearText(By by) {
        // This doesn't always work, thus CTRL+A + DELETE is sent as a safety clause.
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }


}
