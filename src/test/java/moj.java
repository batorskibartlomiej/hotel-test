import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.time.Duration;

import static java.awt.event.KeyEvent.*;

public class moj extends BaseSeleniumTest {





    @Test
    public void FIrstMineSite() throws InterruptedException {



        driver.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&passive=1209600&sacu=1&ignoreShadow=0&hl=pl&acui=0&flowName=GlifWebSignIn&flowEntry=AddSession");

        WebElement email = driver.findElement(By.cssSelector("#identifierId"));
        email.sendKeys("batorski.bartlomiej@gmail.com");

        WebElement confirm = driver.findElement(By.id("identifierNext"));
       // Thread.sleep(2000);
        //waitForWebElement(By.id("identifierNext"));
        confirm.click();
        //Thread.sleep(2000);

        WebDriverWait wait2 = new WebDriverWait(driver,9,2);

       // WebElement pass;
        WebElement pass= wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));




        //waitForWebElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
        //WebElement pass = driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));


        pass.sendKeys("Wilno2016");
        WebElement  element=driver.findElement(By.cssSelector("#passwordNext > span > span"));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", element);
     // WebElement button = driver.findElement(By.cssSelector("#passwordNext > span > span"));


        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@gh='cm']"))).click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to']"))).sendKeys("batorskib@gmail.com");

        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='subjectbox']"))).sendKeys("batorskib@gmail.com");
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='textbox']"))).sendKeys("batorskib@gmail.com");

       //utton.click();
       // Thread.sleep(9000);
     // WebElement  elemen2=driver.findElement(By.cssSelector("[gh='cm']"));
     // JavascriptExecutor e2=(JavascriptExecutor)driver;
     // e2.executeScript("arguments[0].click()", elemen2);
      //waitForWebElement(By.cssSelector("#\\:k1 > div > div"));
      //WebElement msg = driver.findElement(By.cssSelector("#\\:k1 > div > div"));

        //WebElement msg = driver.findElement(By.id("*[@id=':js']/div/div/text()"));
      //msg.click();



       // Thread.sleep(9000);
        //waitForWebElement(By.xpath("/html/body/div[24]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[2]"));

        ////*[@id=":p8"]
        ///html/body/div[24]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[2]



       // WebElement toWho = driver.findElement(By.xpath("/html/body/div[24]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[2]"));
        //toWho.click();
        //toWho.sendKeys("batorskib@gmail.com");



        //WebElement subject = driver.findElement(By.id(":p2"));
       // subject.sendKeys("automat");

       // WebElement text = driver.findElement(By.id(":q8"));
        //text.sendKeys("I love myself!!!!:)");

        // wait = new WebDriverWait(driver, 20);


        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@style='user-select: none;']"))).click();

        Thread.sleep(200);
        //scieazka do pliku
        String path2 = new File("src/main/resources/test170894100.png").getAbsolutePath();
        //metoda uploadu
        try {
            uploadFile(path2);
            Thread.sleep(5000);
        } catch (AWTException e) {
            System.out.println("nie ma załącznika");
        }

        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Wysłane"))).click();
        //waitForWebElement(By.linkText("Wysłane"));
        //WebElement sended = driver.findElement(By.linkText("Wysłane"));
        //sended.click();

        //waitForWebElement(By.id(":m1"));
        //WebElement checked = driver.findElement(By.id(":m1"));
       // checked.click();

        //waitForWebElement(By.className("asa"));

        Actions button3 = new Actions(driver);

        WebElement usun = driver.findElement(By.xpath("//*[@id=':4']/div[2]/div[1]/div[1]/div/div/div[2]/div[3]"));
        button3.moveToElement(usun).build().perform();
        usun.click();

        waitForWebElement(By.xpath("//*[@id=\":k2\"]/div/div"));
        WebElement wyslij = driver.findElement(By.xpath("//*[@id=\":k2\"]/div/div"));

        wyslij.click();

        WebElement text2 = driver.findElement(By.id(":qt"));

        text2.sendKeys("I oto mój cały test");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("alert('I LOVE YOU BABY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!')");




    }



    public void uploadFile(String path) throws AWTException{


        driver.findElement(By.id(":ql")).click();


        Robot robot = new Robot();
        robot.delay(2000);

        //zapisanie sciezki do pamieci podrecznej
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(path);
        clipboard.setContents(stringSelection, stringSelection);
        //przetrzymanie i puszczenie ctrl +V
        robot.keyPress(VK_CONTROL);
        robot.keyPress(VK_V);
        robot.delay(2000);
        robot.keyRelease(VK_V);
        robot.keyRelease(VK_CONTROL);

        robot.keyPress(VK_ENTER);
        robot.keyRelease(VK_ENTER);

    }


        public void waitForWebElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
            ((WebDriverWait)wait).pollingEvery(Duration.ofMillis(500));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));


    }








    }

