import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utils.webDriverUtils;
import pages.GumtreeAssignment.HomepageGumTree;
import pages.GumtreeAssignment.PostAnAd;

import static org.utils.dataPath.BASE_URL_GUMTREE;

public class GumtreeAssignment {
    @Test
    public void Assignment2() throws InterruptedException {
        webDriverUtils webDriver= new webDriverUtils();
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
