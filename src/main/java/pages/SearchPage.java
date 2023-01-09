package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private WebDriver driver;

    private By searchField =By.id("search_product");
    private By searchButton =By.id("submit_search");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearch(String search){
        driver.findElement(searchField).sendKeys(search);
    }

    public void setSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void numberOfSearchResult(){
        List<WebElement> result=driver.findElements(By.className("col-sm-4"));
        System.out.println("The Number of Search results :" + (result.size()-1));
    }
}
