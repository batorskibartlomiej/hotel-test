import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends BaseSeleniumTest {


    @Test
    public void DoubleClick() {


        SeleniumHelper helper = new SeleniumHelper(driver);

        driver.get("file:///C:/Users/bartek/Desktop/DoubleClick.html");
        WebElement Click = driver.findElement(By.id("bottom"));

        Actions action = new Actions(driver);
        action.moveToElement(Click).doubleClick().build().perform();
        helper.takeScreenshot();

        Assert.assertTrue(driver.getWindowHandles().size()>1);


    }

}


