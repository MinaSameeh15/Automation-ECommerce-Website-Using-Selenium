package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AddToCartPage {
    private WebDriver driver;
    private By ContinueBtn = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    private By viewCart = By.partialLinkText("View Cart");




    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void hover() throws InterruptedException{

        //to Scroll Down
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement element1=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]"));
        WebElement element2=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]"));
        WebElement element3=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[4]/div/div[1]/div[1]"));

        Actions action=new Actions(driver);


        action.moveToElement(element1).perform();
        Thread.sleep(1000);
        action.moveToElement(element2).perform();
        Thread.sleep(1000);
        action.moveToElement(element3).perform();
        Thread.sleep(1000);
        action.moveToElement(element1).perform();
        Thread.sleep(1000);
        WebElement addToCart1=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a/i"));
        action.moveToElement(addToCart1);
        Thread.sleep(1000);
        action.click().build().perform();
        Thread.sleep(1000);
        Continue();
        action.moveToElement(element2).perform();
        Thread.sleep(1000);
        WebElement addToCart2=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a"));
        action.moveToElement(addToCart2);
        Thread.sleep(1000);
        action.click().build().perform();
        Thread.sleep(1000);
        ViewCart();
        Thread.sleep(1000);




    }


    public void Continue(){
        driver.findElement(ContinueBtn).click();
    }

    public void ViewCart(){
        driver.findElement(viewCart).click();
    }


}
