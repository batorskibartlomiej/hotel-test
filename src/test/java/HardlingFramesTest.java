
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HardlingFramesTest extends BaseSeleniumTest {






        @Test
        public void hardlingFrmaesTest() {
            driver.get("file:///C:/Users/bartek/Desktop/iFrameTest.html");
            driver.switchTo().frame(0);
            WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
            clickOnMeButton.click();
            driver.switchTo().alert().accept();
            List<WebElement> headers = driver.findElements(By.tagName("h1"));

            System.out.println(headers.size());
            headers.forEach(WebElement ->
                    System.out.println(WebElement.getText()));

        }
























        }


