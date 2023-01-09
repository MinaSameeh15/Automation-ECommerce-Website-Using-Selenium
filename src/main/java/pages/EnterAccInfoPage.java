package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterAccInfoPage {
    private WebDriver driver;
    private By statusAlert = By.xpath("//*[@id=\"form\"]/div/div/div/div/h2");

    private By title =By.id("id_gender1");
    private By passwordField =By.id("password");

    private By dropDownDays =By.id("days");
    private By getDropDownMonth=By.id("months");
    private By getDropDownYear=By.id("years");

    private By signupForOurNewsLetter =By.id("newsletter");
    private By receiveSpecialOffersFromOurPartners =By.id("optin");

    private By firstNameField=By.id("first_name");
    private By lastNameField=By.id("last_name");
    private By companyField=By.id("company");
    private By address1Field=By.id("address1");
    private By address2Field=By.id("address2");

    private By dropDownCountry =By.id("country");

    private By stateField=By.id("state");
    private By cityField=By.id("city");
    private By zipcodeField=By.id("zipcode");
    private By mobileNumberField=By.id("mobile_number");

    private By creatAccountBtn=By.xpath("//button[@type='submit']");

    public EnterAccInfoPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }


    //Date of birth Section
    public void selectDay(String option){
        Select daySelect =new Select(driver.findElement(dropDownDays));
        daySelect.selectByValue(option);
    }
    public void selectMonth(String option){
        Select daySelect =new Select(driver.findElement(getDropDownMonth));
        daySelect.selectByValue(option);
    }
    public void selectYear(String option){
        Select daySelect =new Select(driver.findElement(getDropDownYear));
        daySelect.selectByValue(option);
    }

    //check Buttons
    public void check1(){
       driver.findElement(signupForOurNewsLetter).click();
    }
    public void check2(){
        driver.findElement(receiveSpecialOffersFromOurPartners).click();
    }
    public void selectTitle(){
        driver.findElement(title).click();
    }




    //privet info

    public void setFirstName(String fName){
        driver.findElement(firstNameField).sendKeys(fName);
    }
    public void setLastName(String lName){
        driver.findElement(lastNameField).sendKeys(lName);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setCompany(String c){
        driver.findElement(companyField).sendKeys(c);
    }
    public void setAddress1(String add1){
        driver.findElement(address1Field).sendKeys(add1);
    }
    public void setAddress2(String add2){
        driver.findElement(address2Field).sendKeys(add2);
    }
    public void selectCountry(String option){
        Select country =new Select(driver.findElement(dropDownCountry));
        country.selectByValue(option);
    }
    public void setstateField(String c){
        driver.findElement(stateField).sendKeys(c);
    }
    public void setcityField(String c){
        driver.findElement(cityField).sendKeys(c);
    }
    public void setzipcodeField(String c){
        driver.findElement(zipcodeField).sendKeys(c);
    }
    public void setmobileNumberField(String c){
        driver.findElement(mobileNumberField).sendKeys(c);
    }

    public RegisterCompletePage clickCreatAccountBtuun(){
        driver.findElement(creatAccountBtn).click();
        return new RegisterCompletePage(driver);
    }
}