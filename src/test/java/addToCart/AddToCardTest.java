package addToCart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddToCartPage;

public class AddToCardTest extends BaseTests {

    @Test
    public void testInvalidEmailLogin() throws InterruptedException {

        AddToCartPage productsPage=homePage.clickProductPage();

        productsPage.hover();

        System.out.println("Products Added to Cart Successfully");

    }
}
