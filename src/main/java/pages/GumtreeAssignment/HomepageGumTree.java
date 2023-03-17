package pages.GumtreeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageGumTree {
    WebDriver driver;
    public HomepageGumTree (WebDriver driver){this.driver=driver;}
    public void clickLoginButton(){driver.findElement(By.cssSelector("span[class=\"icon icon--circ-plus css-0 eom5h670\"]")).click();}
    public void clickPostAnAd(){
        driver.findElement(By.cssSelector("a[class=\"btn-primary no-ads-button\"]")).click();
    }


    public void HomePage(){
        clickLoginButton();
        LogInGumtree login = new LogInGumtree(driver);
        login.loginPage();
        clickPostAnAd();

    }
}
