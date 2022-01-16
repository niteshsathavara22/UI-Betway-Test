package stepDefinitions;

import cucumber.api.java.en.Then;
import pageObjects.todayMatchList.MatchListPage;

public class TodayMatchList_MyStepdefs {
    MatchListPage matchListPage = new MatchListPage();


    @Then("^get a record all team name which are playing today$")
    public void getARecordAllTeamNameWhichArePlayingToday() {
        matchListPage.today_Match_Name();
    }
}
