package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReusableMethods {


    public static String getScreenshot(String name) throws IOException {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }


    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void cookieHandle(WebElement webElement) {
        try {
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}