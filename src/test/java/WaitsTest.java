import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;


public class WaitsTest extends BaseSeleniumTest {

    @Test
    public void waitTest() {

        //driver.manage().timeouts().implicitlyWait(150L, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/bartek/Desktop/Waits.html");
        driver.findElement(By.tagName("button")).click();
        waitForWebElement(By.tagName("p"));

        //sleep(6000);

        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());


        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
        //Assert.assertTrue(paragraph.getText().equals("Dopiero się pojawiłem!"));

    }

    public void waitForWebElemen3(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }
/*
    public void waitForWebElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(new Function<WebDriver, Boolean>() {


            @Override
            public Boolean apply(WebDriver driver) {
                System.out.println("Sprawdzamy");
                if (driver.findElement(locator).isDisplayed()) {
                    System.out.println("Element istnieje");
                    return true;

                } else {
                    System.out.println("Elememnt nie istnieje");
                    return false;
                }

            }
        });

*/
        public void waitForWebElement(By locator) {
            Wait<WebDriver> wait = new WebDriverWait(driver, 10);
            wait.until(driver1 -> {
                System.out.println("Sprawdzamy");



                    if(driver.findElement(locator).isDisplayed()) {
                        System.out.println("Element istnieje");
                        return true;

                    } else {
                        System.out.println("Elememnt nie istnieje");
                        return false;
                    }


            });





    }

    public void waitForWebElement2(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500));
        wait.withTimeout(Duration.ofSeconds(10));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }






}


