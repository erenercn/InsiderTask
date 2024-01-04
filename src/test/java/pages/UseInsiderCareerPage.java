package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class UseInsiderCareerPage {

    public UseInsiderCareerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id ="career-our-location")
    public WebElement locationsBlock;

    @FindBy (xpath = "//*[text()='See all teams']")
    public WebElement seeAllTeamsButton;

    @FindBy(id = "career-find-our-calling")
    public WebElement teamsBlock;

    @FindBy (xpath = "//*[@data-id='a8e7b90']")
    public WebElement lifeAtInsiderBlock;




}
