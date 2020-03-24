import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascirptExecution extends BaseSeleniumTest {

    @Test
    public void googleSearchTest() {

        driver.get("http://www.google.com");

       WebElement searchInput = driver.findElement(By.name("q"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;


        Actions action = new Actions(driver);
        action.contextClick().build().perform();

        //executor.executeScript("alert('Hello World')");
        executor.executeScript("arguments[0].setAttribute('value', 'Selenium')", searchInput);

        searchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPage= driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a[1]/h3"));

        executor.executeScript("arguments[0].click();",seleniumPage);

        String expectedTitle = "Selenium - Web Browser Automation";
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
    }


}