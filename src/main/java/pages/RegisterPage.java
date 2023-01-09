package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private WebDriver driver;

    private By nameField =By.name("name");
    private By emailField=By.xpath("//div[@class='signup-form']//input[@name='email']");
    private By signupButton = By.xpath("//div[@class='signup-form']//button[@type='submit']");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setname(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setemail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EnterAccInfoPage clickSignUpButton(){
        driver.findElement(signupButton).click();
        return new EnterAccInfoPage(driver);
    }

}
