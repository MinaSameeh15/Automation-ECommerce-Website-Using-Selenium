package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterCompletePage {
    private WebDriver driver;
    private By statusAlert=By.xpath("//*[@id=\"form\"]/div/div/div/h2");


    public RegisterCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
