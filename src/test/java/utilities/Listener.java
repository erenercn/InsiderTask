package utilities;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener  implements ITestListener {


    @Override
    public void onTestFailure(ITestResult result) {
        try {
            ReusableMethods.getScreenshot("TEST CASE FAILED : " + result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
