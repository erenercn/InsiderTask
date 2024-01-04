package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.*;



public class FilterTest extends TestBaseReports {


    UseInsiderQaPage useInsiderQaPage;
    OpenPositionsPage openPositionsPage;

    @Test
    public void isJobListVisible() {
        Actions actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Insider Test", "Visibility of Job List");
        useInsiderQaPage = new UseInsiderQaPage();
        openPositionsPage = new OpenPositionsPage();
        Driver.getDriver().get(ConfigReader.getProperty("career_url"));

        ReusableMethods.cookieHandle(openPositionsPage.cookie);
        ReusableMethods.clickWithJS(useInsiderQaPage.seeAllQaJobsButton);

        ReusableMethods.waitFor(6);

        if (!openPositionsPage.departmentFilter.getText().contains("Quality Assurance")) {
            openPositionsPage.departmentFilter.click();
            openPositionsPage.qaSelection.click();
        }

        openPositionsPage.locationFilter.click();


        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            boolean isPositionListVisible = openPositionsPage.positionList.isDisplayed();
            Assert.assertTrue(isPositionListVisible);

            ReusableMethods.waitFor(3);

            for (int i = 0; i < openPositionsPage.positions.size(); i++) {

                if (openPositionsPage.positions.get(i).getText().contains("Quality Assurance")) {
                    Assert.assertTrue(openPositionsPage.positions.get(i).getText().contains("Quality Assurance"));
                } else {
                    Assert.assertFalse(openPositionsPage.positions.get(i).getText().contains("Quality Assurance"));
                }

            }

            for (int i = 0; i < openPositionsPage.departments.size(); i++) {

                if (openPositionsPage.departments.get(i).getText().contains("Quality Assurance")) {
                    Assert.assertTrue(openPositionsPage.departments.get(i).getText().contains("Quality Assurance"));
                } else {
                    Assert.assertFalse(openPositionsPage.departments.get(i).getText().contains("Quality Assurance"));
                }

            }

            for (int i = 0; i < openPositionsPage.locations.size(); i++) {

                if (openPositionsPage.locations.get(i).getText().contains("Istanbul, Turkey")) {
                    Assert.assertTrue(openPositionsPage.locations.get(i).getText().contains("Istanbul, Turkey"));
                } else {
                    Assert.assertFalse(openPositionsPage.locations.get(i).getText().contains("Istanbul, Turkey"));
                }

            }


        }
    }


