import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class TestW3schools extends BaseSeleniumTest {


    @Test
    public void w3schoolsTest() {

        driver.get("http://www.w3schools.com");
        Actions action = new Actions(driver);
        //action.contextClick().build().perform();
        WebElement act = driver.findElement(By.id("navbtn_tutorials"));
        //action.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();
        action.moveToElement(act).build().perform();
        act.click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement link = driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div[1]/a[1]"));
       // action.moveToElement(link).build().perform();
        link.click();

    }


}

