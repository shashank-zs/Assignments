import org.openqa.selenium.WebDriver;
import org.qa.utils.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.qa.utils.WebDriverUtils;
import pages.GumtreeAssignment.HomepageGumTree;
import pages.GumtreeAssignment.PostAnAd;

import java.awt.*;
import java.io.IOException;

import static org.qa.utils.DataPath.*;

public class GumtreeAssignment {
    @DataProvider(name = "dataProvider")
    public Object[][] DataProviderForExtension() throws IOException {
        return ExcelReader.getData(PATH_EXCEL_GUMTREE, SHEETNAME_GUMTREE);
    }
    @Test(dataProvider="dataProvider")
    public void Assignment2(String postCode,String title,String imagePath,String youTubeLink,String description,Integer price,String websiteLink,String editPostCode,Integer phone) throws InterruptedException, AWTException {
        WebDriverUtils webDriver= new WebDriverUtils();
        webDriver.browserOpen();
        WebDriver driver = webDriver.driver;
        driver.get(BASE_URL_GUMTREE);
        HomepageGumTree homepage = new HomepageGumTree(driver);
        homepage.HomePage();
        PostAnAd postAdSteps =new PostAnAd(driver);
        postAdSteps.adPost(postCode,title,imagePath,youTubeLink,description,price,websiteLink,editPostCode,phone);

    }
}
