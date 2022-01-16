package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.articles.SportArticlesList;

public class SportArticles_MyStepdefs {
    SportArticlesList sportArticlesList = new SportArticlesList();

    @When("^User click on the search box$")
    public void userClickOnTheSearchBox() {
        sportArticlesList.clickOnSearchBox();
    }

    @And("^User enter text in search box$")
    public void userEnterTextInSearchBox() {
        sportArticlesList.enterSportArticlesText();
    }

    @Then("^User see list of the sports articles name$")
    public void user_see_list_of_the_sports_articles_name() {
        sportArticlesList.listOfSportArticles();
    }







}
