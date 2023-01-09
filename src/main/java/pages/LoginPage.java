package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By emailField =By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By passwordField=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    private By loginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    private By statusAlert = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }


    public LoggedInPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new LoggedInPage(driver);
    }


    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
