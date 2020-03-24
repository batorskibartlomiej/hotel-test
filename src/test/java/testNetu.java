import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNetu {


    @Test
    public void FIrstMineSite() throws InterruptedException {
        String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.speedtest.pl/");

        Thread.sleep(5000);

        WebElement email = driver.findElement(By.cssSelector("#start-btn"));
        email.click();







    }
}
