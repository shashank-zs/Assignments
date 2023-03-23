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
    WebElement inputEmail= driver.findElement(By.cssSelector("input[id=\"email\"]"));
    WebElement inputPassword= driver.findElement(By.cssSelector("input[id=\"fld-password\"]"));
    WebElement clickLogIn = driver.findElement(By.cssSelector("button[class=\"btn-primary btn-full-width\"]"));

    public void loginPage(){
       driver.findElement(By.cssSelector("a[data-q=\"login-tab\"]")).isDisplayed();
        inputEmail.sendKeys(EMAIL);
        inputPassword.sendKeys(PASSWORD);
        clickLogIn.click();

    }
}
