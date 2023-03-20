import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utils.WebDriverUtils;
import pages.GumtreeAssignment.HomepageGumTree;
import pages.GumtreeAssignment.PostAnAd;

import java.awt.*;
import java.io.IOException;

import static org.utils.DataPath.BASE_URL_GUMTREE;

public class GumtreeAssignment {
    @Test
    public void Assignment2() throws InterruptedException, IOException, AWTException {
        WebDriverUtils webDriver= new WebDriverUtils();
        webDriver.browserOpen();
        WebDriver driver = webDriver.driver;
        driver.get(BASE_URL_GUMTREE);
        HomepageGumTree homepage = new HomepageGumTree(driver);
        homepage.HomePage();
        PostAnAd postAdSteps =new PostAnAd(driver);
        postAdSteps.adPost();
       // driver.quit();

    }

}
