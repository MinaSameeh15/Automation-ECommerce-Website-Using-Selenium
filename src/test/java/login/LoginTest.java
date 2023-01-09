package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoggedInPage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTests {


    @Test
    public void testInvalidEmailLogin() throws InterruptedException{

        LoginPage loginPage= homePage.clickLoginPage();

        loginPage.setEmail("mmiina88812@gmail.com.com");
        loginPage.setPassword("minamina123");
        loginPage.clickLoginButton();

        assertEquals(loginPage.getAlertText(),"Your email or password is incorrect!","Error");
        loginPage.getAlertText();

        System.out.println("enter with invalid Email Fail");
        Thread.sleep(1000);

    }
    @Test
    public void testInvalidPasswordLogin() throws InterruptedException {

        LoginPage loginPage= homePage.clickLoginPage();

        loginPage.setEmail("mmii3na8181222@gmail.com");
        loginPage.setPassword("roott");
        loginPage.clickLoginButton();

        assertEquals(loginPage.getAlertText(),"Your email or password is incorrect!","Error");
        loginPage.getAlertText();
        Thread.sleep(1000);
        System.out.println("enter with invalid Password Fail");

    }

    @Test
    public void testSuccessfulLogin()throws InterruptedException{

        LoginPage loginPage= homePage.clickLoginPage();

        loginPage.setEmail("minasameeh08@gmail.com");
        loginPage.setPassword("123456");
        LoggedInPage loggedinPage= loginPage.clickLoginButton();

        assertEquals(loggedinPage.getAlertText(),"Logged in as Mina Sameeh","Login Field");
        loggedinPage.getAlertText();
        System.out.println("LoggedIn Successfully");


        //LogOut After Successfully Login
        loggedinPage.setLogOut();
        String expectedResult="https://automationexercise.com/login";
        String actualResult=driver.getCurrentUrl();

        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("LoggedOut Successfully");
        Thread.sleep(1000);
    }
}
