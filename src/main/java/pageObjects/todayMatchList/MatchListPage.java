package pageObjects.todayMatchList;

import helper.CommonMethod;
import org.openqa.selenium.By;

public class MatchListPage extends CommonMethod {
    private By $totalMatch = By.xpath("//span[contains(@class,'gs-u-display-none gs-u-display-block@m')]");

    private By $getTeamName(int index) {
        return By.xpath("(//span[contains(@class,'gs-u-display-none gs-u-display-block@m')])[" + index + "]");
    }

    public void today_Match_Name() {
        //finding total number of team
        int totalTeams = driver.findElements($totalMatch).size();

        if (totalTeams >= 1)//this condition for total number of team greater than 1 than go inside
        { //print total number of team
            System.out.println("Total number of teams are playing today is = " + totalTeams);

            for (int number = 1; number < totalTeams; number++)//for loop for number of team
            {
                //if this condition true then do inside
                if (number % 2 != 0) {  //save variable in homeTeam
                    String homeTeam = getTextFromElement($getTeamName(number));
                    //variable second team
                    int vsTeamIndex = number + 1;
                    //save variable in away team
                    String vsTeam = getTextFromElement($getTeamName(vsTeamIndex));

                    System.out.println(homeTeam + " Vs " + vsTeam);
                }
            }
        } else {

            System.out.println("There is not any match today");
        }
    }
}
