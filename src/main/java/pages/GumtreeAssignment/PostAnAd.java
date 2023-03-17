package pages.GumtreeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostAnAd {
    WebDriver driver;
    WebDriver wait;

    public PostAnAd (WebDriver driver){this.driver=driver;}
    public void clickNoThanks(){
        driver.findElement(By.cssSelector("input[class=\"btn-secondary set-left grid-col-12 grid-col-s-5\"]")).click();
    }
    public void clickBrowse(){
       WebElement browse= driver.findElement(By.cssSelector("button[class=\"btn-link set-left form-row-label space-mts\"]"));
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
        Thread.sleep(15);
        driver.findElement(By.cssSelector("id=\"post-ad_websiteUrl\"")).isDisplayed();
        driver.findElement(By.cssSelector("id=\"post-ad_websiteUrl\"")).sendKeys(link);
    }
    public void ClickEditMyDetails(){
        driver.findElement(By.cssSelector("a[href=\"/manage-account/\"]")).click();
    }

    public void adPost() throws InterruptedException {
        try{
            clickNoThanks();
        } catch (Exception e) {
        }

        clickBrowse();
        clickForSale();
        clickAudioStereo();
        clickPersonalStereos();
        clickMp3Players();
        clickContinue();
        try{
            inputPostCode("PO16 7GZ");
            clickGo();
        } catch (Exception e) {
        }
        addTitle("ipod");
        checkUrgent();
        AddYoutubeLink("https://www.youtube.com/watch?v=gCuoVMmes4c");
        addDescription("iPod is 7 years old , sound is good and clear . Easy to carry and 32 gb internal storage.");
        setPrice("23");
        checkIncludeWebsite();
        inputWebsiteLink("www.shashank.com");
        ClickEditMyDetails();

    }
}
