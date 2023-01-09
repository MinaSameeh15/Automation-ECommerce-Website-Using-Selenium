package products;

import base.BaseTests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.SearchPage;


public class SearchTest extends BaseTests {

    @Test
    public void testSearch() throws InterruptedException{

        SearchPage searchPage=homePage.clickSearchPage();




        searchPage.setSearch("Top");
        searchPage.setSearchButton();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(2000);
        searchPage.numberOfSearchResult();

    }

    @Test
    public void testSearch2(){

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-650)", "");
        SearchPage searchPage=homePage.clickSearchPage();


        searchPage.setSearch("potato Search");
        searchPage.setSearchButton();
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,350)", "");
        searchPage.numberOfSearchResult();
    }
}