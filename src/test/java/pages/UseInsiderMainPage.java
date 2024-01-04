package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class UseInsiderMainPage {

    public UseInsiderMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "navbarDropdownMenuLink")
    public WebElement companyDropdown;

    @FindBy (xpath = "//*[text()='Careers']")
    public WebElement careerButton;

}
