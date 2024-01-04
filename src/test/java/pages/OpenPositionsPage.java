package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OpenPositionsPage {

    public OpenPositionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "wt-cli-accept-all-btn")
    public WebElement cookie;
    @FindBy(id = "select2-filter-by-location-container")
    public WebElement locationFilter;

    @FindBy (id = "select2-filter-by-department-result-zzb5-Quality Assurance")
    public WebElement qaSelection;
    @FindBy(id = "select2-filter-by-department-container")
    public WebElement departmentFilter;

    @FindBy (id = "career-position-list")
    public WebElement positionList;


    @FindBy (xpath = "//*[@class='position-title font-weight-bold']")
    public List<WebElement> positions;

    @FindBy (xpath = "//*[@class='position-department text-large font-weight-600 text-primary']")
    public List<WebElement> departments;

    @FindBy (xpath = "//*[@class='position-location text-large']")
    public List<WebElement> locations;
}
