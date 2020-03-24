
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class GoogleTest extends BaseSeleniumTest {

    @FindBy(name = "q")
    private List<WebElement> searchInput;

    @FindBy(partialLinkText = "https://selenium.dev")
    private WebElement seleniumPage;


    @Test
    public void googleOpenTest() {

        SeleniumHelper helper = new SeleniumHelper(driver);

        driver.get("http://www.google.com");
        PageFactory.initElements(driver, this);

       // WebElement searchInput = driver.findElement(By.name("q"));


        searchInput.get(0).sendKeys("Selenium");
        helper.takeScreenshot();
        searchInput.get(0).sendKeys(Keys.ENTER);
        helper.takeScreenshot();


        //WebElement seleniumPage= driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/div/div[1]/a[1]/h3")); tez dizla
        //WebElement seleniumPage = driver.findElement(By.partialLinkText("https://selenium.dev"));
        //seleniumWeb.click();
        // driver.quit();
    seleniumPage.click();

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

























    }
