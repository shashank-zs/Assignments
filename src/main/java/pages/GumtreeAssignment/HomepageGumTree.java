package pages.GumtreeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageGumTree {
    WebDriver driver;
    public HomepageGumTree (WebDriver driver){this.driver=driver;}
    public void clickNoThanks(){
        driver.findElement(By.cssSelector("input[class=\"btn-secondary set-left grid-col-12 grid-col-s-5\"]")).click();
    }
    public void clickLoginButton(){driver.findElement(By.cssSelector("span[class=\"icon icon--circ-plus css-0 eom5h670\"]")).click();}
    public void clickPostAnAd(){
        driver.findElement(By.cssSelector("a[class=\"btn-primary no-ads-button\"]")).click();
    }
    public void clickDelete(){
        driver.findElement(By.cssSelector("p[class=\"manage-ads-delete\"]")).click();
        driver.findElement(By.cssSelector("a[title=\"Ad was not successful\"]")).click();
    }


    public void HomePage(){
        clickLoginButton();
        LogInGumtree login = new LogInGumtree(driver);
        login.loginPage();
        try{
            clickPostAnAd();
        } catch (Exception e) {
        }
        try{
            clickDelete();
            clickPostAnAd();
        } catch (Exception e) {
        }
        try{
            clickNoThanks();
        } catch (Exception e) {
        }

    }
}
