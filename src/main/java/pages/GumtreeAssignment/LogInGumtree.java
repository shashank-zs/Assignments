package pages.GumtreeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        inputEmail("shashankpurohitak50@gmail.com");
        inputPassword("Shashank@1");
        clickLogIn();

    }
}
