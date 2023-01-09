package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickLoginPage(){
        clickLink("Signup");
        return new LoginPage(driver);
    }

    public RegisterPage clickRegisterPage(){
        clickLink("Signup");
        return new RegisterPage(driver);
    }

    public SearchPage clickSearchPage(){
        clickLink("Products");
        return new SearchPage(driver);
    }

    public AddToCartPage clickProductPage(){
        clickLink("Products");
        return new AddToCartPage(driver);
    }


    private void clickLink(String linkText){
        driver.findElement(By.partialLinkText(linkText)).click();
    }
}
