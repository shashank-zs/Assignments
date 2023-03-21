package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Driver;

public class GumtreeHelper {
    static WebDriver driver;
    public GumtreeHelper (WebDriver driver){this.driver=driver;}

    public static void assertionHomepage(){

        WebElement CarText = driver.findElement(By.cssSelector("a[href=\"/cars\"]>span"));
        Assert.assertEquals(CarText.getText(),"Cars & Vehicles");
        WebElement saleText = driver.findElement(By.cssSelector("a[href=\"/for-sale\"]>span"));
        Assert.assertEquals(saleText.getText(),"For Sale");
        WebElement textProperty = driver.findElement(By.cssSelector("a[href=\"/flats-houses\"]>span"));
        Assert.assertEquals(textProperty.getText(),"Property");
        WebElement textJob = driver.findElement(By.cssSelector("a[href=\"/jobs\"]>span"));
        Assert.assertEquals(textJob.getText(),"Jobs");
        WebElement textService  = driver.findElement(By.cssSelector("a[href=\"/business-services\"]>span"));
        Assert.assertEquals(textService.getText(),"Services");
        WebElement textCommunity = driver.findElement(By.cssSelector("a[href=\"/community\"]>span"));
        Assert.assertEquals(textCommunity.getText(),"Community");
        WebElement textPets  = driver.findElement(By.cssSelector("a[href=\"/pets\"]>span"));
        Assert.assertEquals(textPets.getText(),"Pets");

    }
    public static void SwitchToNewWindow(){
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    public static void SwitchToPrevWindow(){
        String newWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if(!newWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
