package pages.GumtreeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.qa.utils.DataPath.EMAIL;
import static org.qa.utils.DataPath.PASSWORD;

public class LogInGumtree {
    WebDriver driver;
    public LogInGumtree(WebDriver driver){this.driver=driver;}
    public void inputEmail(String email){
        driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys(email);
    }
    public void inputPassword(String pass){
        driver.findElement(By.cssSelector("input[id=\"fld-password\"]")).sendKeys(pass);
    }
    public void clickLogIn(){
        driver.findElement(By.cssSelector("button[class=\"btn-primary btn-full-width\"]")).click();
    }
    public void loginPage(){
       driver.findElement(By.cssSelector("a[data-q=\"login-tab\"]")).isDisplayed();
        inputEmail(EMAIL);
        inputPassword(PASSWORD);
        clickLogIn();

    }
}
