package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInPage {
    private WebDriver driver;
    private By logOut =By.partialLinkText("Logout");

    private By statusAlert = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");


    public LoggedInPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
       return driver.findElement(statusAlert).getText();
    }
    public void setLogOut(){
        driver.findElement(logOut).click();
    }

}
