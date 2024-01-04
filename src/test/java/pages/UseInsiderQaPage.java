package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class UseInsiderQaPage {
    public UseInsiderQaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath ="//*[text()='See all QA jobs']")
    public WebElement seeAllQaJobsButton;



}
