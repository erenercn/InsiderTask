package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.*;

public class CompanyInfoTest extends TestBaseReports {


    UseInsiderMainPage useInsiderMainPage;
    UseInsiderCareerPage useInsiderCareerPage;


    @Test
    public void isCompanyInfoVisible() {

        extentTest = extentReports.createTest("Insider Test", "Checking Company Info");
        useInsiderMainPage = new UseInsiderMainPage();
        useInsiderCareerPage = new UseInsiderCareerPage();
        Driver.getDriver().get(ConfigReader.getProperty("main_url"));
        String actualMainPageTitle = Driver.getDriver().getTitle();
        String expectedMainPageTitle = "#1 Leader in Individualized, Cross-Channel CX — Insider";
        Assert.assertEquals(actualMainPageTitle, expectedMainPageTitle);


        ReusableMethods.clickWithJS(useInsiderMainPage.companyDropdown);
        ReusableMethods.clickWithJS(useInsiderMainPage.careerButton);

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Ready to disrupt? | Insider Careers";
        ReusableMethods.clickWithJS(useInsiderCareerPage.seeAllTeamsButton);
        boolean isLocationVisible = useInsiderCareerPage.locationsBlock.isDisplayed();
        boolean isTeamsVisible = useInsiderCareerPage.teamsBlock.isDisplayed();
        boolean isLifeAtInsiderVisible = useInsiderCareerPage.lifeAtInsiderBlock.isDisplayed();

        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(isLocationVisible);
        Assert.assertTrue(isTeamsVisible);
        Assert.assertTrue(isLifeAtInsiderVisible);

        extentTest.info("Company info is visible");

    }
}
