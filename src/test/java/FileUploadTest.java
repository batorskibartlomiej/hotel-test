import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest{

    @Test
    public void uploadFileTest() {

        driver.get("file:///C:/Users/bartek/Desktop/FileUpload.html");

        String path = new File("src/main/resources/test170894100.png").getAbsolutePath();

        WebElement inputButton = driver.findElement(By.id("myFile"));
        inputButton.sendKeys(path);







    }
}
