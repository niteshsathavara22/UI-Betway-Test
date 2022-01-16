package pageObjects.articles;

import helper.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;

public class SportArticlesList extends CommonMethod {
    private By $searchBox = By.id("orb-search-q");
    private By $sportArticlesName = By.xpath("(//a[@class='ssrcss-atl1po-PromoLink e1f5wbog0'])");

    public void clickOnSearchBox() {
        clickElement($searchBox);
    }

    public void enterSportArticlesText() {
        enterText($searchBox, "Sports articles" + Keys.ENTER);
    }

    private By $articlesHeader(int index) {
        return By.xpath("(//a[@class='ssrcss-atl1po-PromoLink e1f5wbog0'])[" + index + "]");
    }


    public void listOfSportArticles() {

        //find out total articles number
        int sizeArticles = driver.findElements($sportArticlesName).size();
        System.out.println("Size of Articles = " + sizeArticles);

        if (sizeArticles >= 1) {
            //first articles header
            //   (//a[@class='ssrcss-atl1po-PromoLink e1f5wbog0'])[10]

            System.out.println("First article header as below \n" + getTextFromElement($articlesHeader(1)));
            //  thread_Sleep(1000);
            //*****************************************************
            System.out.println("Last article header as Below \n" + getTextFromElement($articlesHeader(sizeArticles)));
        } else {
            System.out.println("There is no articles for sports");
        }

    }
}
