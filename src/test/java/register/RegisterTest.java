package register;

import base.BaseTests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.EnterAccInfoPage;
import pages.RegisterCompletePage;
import pages.RegisterPage;

import static org.testng.Assert.assertEquals;

public class RegisterTest extends BaseTests {


    @Test
    public void testSuccessfulRegister() {
        RegisterPage registerPage = homePage.clickRegisterPage();

        //Enter Acc Info Page
        registerPage.setname("Mina Sameeh");
        registerPage.setemail("minasameeh08@gmail.com");

        EnterAccInfoPage enterAccInfoPage = registerPage.clickSignUpButton();

        //check if Page Open or not
        assertEquals(enterAccInfoPage.getAlertText(), "ENTER ACCOUNT INFORMATION", "Register Field");
        enterAccInfoPage.getAlertText();


        /*  Enter Acc Data Here  */
        enterAccInfoPage.selectTitle();
        enterAccInfoPage.setPassword("123456");
        enterAccInfoPage.selectDay("12");
        enterAccInfoPage.selectMonth("8");
        enterAccInfoPage.selectYear("1999");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");


        enterAccInfoPage.check1();
        enterAccInfoPage.check2();

        enterAccInfoPage.setFirstName("Mina");
        enterAccInfoPage.setLastName("Maher");
        enterAccInfoPage.setCompany("TestCompany");
        enterAccInfoPage.setAddress1("helwan");
        enterAccInfoPage.setAddress2("asyot");

        enterAccInfoPage.selectCountry("Canada");

        enterAccInfoPage.setstateField("Egypt");
        enterAccInfoPage.setcityField("Cairo");
        enterAccInfoPage.setzipcodeField("31513");
        enterAccInfoPage.setmobileNumberField("01277315611");

        RegisterCompletePage registerCompletePage=enterAccInfoPage.clickCreatAccountBtuun();

        assertEquals(registerCompletePage.getAlertText(),"ACCOUNT CREATED!","Create Acc Field Field");
        registerCompletePage.getAlertText();

        System.out.println("Register Complete Successfully");
    }

}
