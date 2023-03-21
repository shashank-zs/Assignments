package pages.GumtreeAssignment;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PostAnAd {
    WebDriver driver;
    public PostAnAd (WebDriver driver){this.driver=driver;}

    public void clickBrowse(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"btn-link set-left form-row-label space-mts\"]")));
        driver.findElement(By.cssSelector("button[class=\"btn-link set-left form-row-label space-mts\"]")).click();
    }

    public void clickForSale(){
        driver.findElement(By.cssSelector("span[class=\"btn-indent-icn icn-tag txt-orphan-from-m\"]")).click();
    }
    public void clickAudioStereo(){
        driver.findElement(By.cssSelector("button[data-category-id=\"2518\"]")).click();
    }
    public void clickPersonalStereos(){
        driver.findElement(By.cssSelector("button[data-category-id=\"2493\"]")).click();
    }
    public void clickMp3Players(){
        driver.findElement(By.cssSelector("button[data-category-id=\"1007\"]")).click();
    }
    public void clickContinue(){
        driver.findElement(By.cssSelector("button[id=\"continueButton\"]")).click();
    }
    public void inputPostCode(String postCode){
        driver.findElement(By.cssSelector("input[id=\"post-ad_postcode\"]")).sendKeys(postCode);
    }
    public void clickGo(){
        driver.findElement(By.cssSelector("button[id=\"update_postcode_location\"]")).click();
    }
    public void addTitle(String title){
        driver.findElement(By.cssSelector("input[id=\"post-ad_title\"]")).sendKeys(title);
    } public void checkUrgent(){

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[class=\"image-uploadab-delete\"]")));

        driver.findElement(By.cssSelector("label[for=\"post-ad_feature_URGENT_TOP_selected\"]")).click();
    }
    public void AddYoutubeLink(String link){
        driver.findElement(By.cssSelector("input[id=\"post-ad_youtube\"]")).sendKeys(link);
    }
    public void addDescription(String desc){
        driver.findElement(By.cssSelector("textarea[id=\"description\"]")).sendKeys(desc);
    }
    public void setPrice(String price){
        driver.findElement(By.cssSelector("input[id=\"price\"]")).sendKeys(price);
    }
    public void checkIncludeWebsite(){
        driver.findElement(By.cssSelector("label[for=\"post-ad_feature_WEBSITE_URL_selected\"]")).click();
    }
    public void inputWebsiteLink(String link) throws InterruptedException {
        driver.findElement(By.cssSelector("input[id=\"post-ad_websiteUrl\"]")).isDisplayed();
        driver.findElement(By.cssSelector("input[id=\"post-ad_websiteUrl\"]")).sendKeys(link);
    }
    public void clickEditPostCode(){
        driver.findElement(By.cssSelector("button[class=\"btn-link txt-link\"]")).click();
    }
    public void editPostCode(String postCode){
        driver.findElement(By.cssSelector("input[id=\"post-ad_postcode\"]")).clear();
        driver.findElement(By.cssSelector("input[id=\"post-ad_postcode\"]")).sendKeys(postCode);
    }
    public void checkPhone(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"btn-link txt-link\"]")));
        driver.findElement(By.cssSelector("label[for=\"post-ad_usePhone\"]")).click();
    }
    public void inputPhone(String phone){
        driver.findElement(By.cssSelector("input[id=\"post-ad_contactTelephone\"]")).sendKeys(phone);
    }
    public void postMyAd(){
        driver.findElement(By.cssSelector("button[id=\"submit-button-2\"]")).click();
    }


    public void adPost(String postCode,String title,String imagePath,String youTubeLink,String description,Integer price,String websiteLink,String editPostCode,Integer phone ) throws InterruptedException, AWTException {
        driver.findElement(By.cssSelector("h1[class=\"space-mbs\"]")).isDisplayed();
        clickBrowse();
        clickForSale();
        clickAudioStereo();
        clickPersonalStereos();
        clickMp3Players();
        clickContinue();
        try{
            inputPostCode( postCode);
            clickGo();
        } catch (Exception e) {
        }
        addTitle( title);
        driver.findElement(By.cssSelector("span[class=\"image-uploadab-icon\"]")).click();

        StringSelection str = new StringSelection( imagePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        driver.switchTo().window(driver.getWindowHandle());

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);

        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        checkUrgent();
        AddYoutubeLink(youTubeLink);
        addDescription(description);
        setPrice(String.valueOf(price));
        checkIncludeWebsite();
        inputWebsiteLink(websiteLink);
        clickEditPostCode();
        editPostCode(editPostCode);
        clickGo();
        checkPhone();
        inputPhone(String.valueOf(phone));
        postMyAd();
    }
}
