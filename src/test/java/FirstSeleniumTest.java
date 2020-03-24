import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;


public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Dimension dimension = new Dimension(1000, 800);
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();

        //driver.get("http://www.google.com");
        driver.get("file:///C:/Users/bartek/Desktop/Test.html");
         WebElement newPageButton = driver.findElement(By.id("newPage"));


        String currentWindowName = driver.getWindowHandle();





         newPageButton.click();


        switchToNewWindow(driver, currentWindowName);



        System.out.println("Tytuł to "+ driver.getTitle());
        System.out.println("Obecny url to "+driver.getCurrentUrl());


        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys(" Mouse");
























        }

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {

        System.out.println("Wartość dla obecnego okna to "+ currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilosc okien przegládarki "+ windows.size());
        for(String window : windows) {
            if(!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }


        }




    }
}       //checkIfElementsExist(By.tagName("a"),driver);
       /* checkIfElementsExist(By.tagName("terefere"), driver);


        checkIfElementsExist1(driver, By.className("terefefdsfsfsfsfre"));


    }


    public boolean checkIfElementsExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size() > 0) {
            System.out.println("Element istnieje na stronie");
            return true;
        }
        System.out.println("Brak elementu na stronie");
        return false;
    }

    public void checkIfElementsExist1(WebDriver driver, By locator) {
        try {
            driver.findElement(locator);
            System.out.println("element istnieje exc");

        } catch (NoSuchElementException exc) {
            System.out.println("nie istnieje exc");

        }

    }
}*/









        // WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
    // Thread.sleep(5000);
    //checkbox.click();
    //Thread.sleep(5000);
    //checkbox.click();
    // WebElement radioButton = driver.findElement(By.xpath("//input[@value='male']"));
    //Thread.sleep(5000);
    // radioButton.click();
       /* WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Mój tekst to "+ paragraph.getText());
        System.out.println("Mój tekst to "+ paragraph.getAttribute("value"));
        System.out.println("Mój tekst to "+ paragraph.getAttribute("textContent"));//ten dziala dla elementow ukrytych
        WebElement smileImg = driver.findElement(By.id("smileImage"));
        System.out.println(smileImg.getSize().getHeight());
        System.out.println(smileImg.getAttribute("naturalHeight"));

        WebElement firstNameInput = driver.findElement(By.name("fname"));
        if(firstNameInput.isEnabled()) {
            System.out.println("element nie jest zablokowany");
            firstNameInput.sendKeys("tomek");
        }   else {
            System.out.println("element jest zablokowany");
        }


        /*
        Select carSelect = new Select(driver.findElement(By.tagName("select")));
        //carSelect.selectByIndex(2);
        //carSelect.selectByVisibleText("Mercedes");
        carSelect.selectByValue("audi");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Tomek");
        //System.out.println("Wartość to " + firstNameInput.getText());-nie dziala
        System.out.println("Wartość to " + firstNameInput.getAttribute("value"));
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla label to " + label.getText());
      //driver.quit();
        /*WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));






        WebElement clickOnMeButton2 = ((ChromeDriver)driver).findElementById("clickOnMe");
        WebElement firstNameInput2 = driver.findElement(By.name("fname"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));//musi byc pelny link
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird"));//czesciowy link
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));





        WebElement firstLink = driver.findElement(By.tagName("a"));

        List<WebElement> links = driver.findElements(By.tagName("a"));

        if(links.size()>0) {
            System.out.println("linki istnieje");
        } else {
            System.out.println("linki nie istnieją");
        }
        System.out.println("Na ekranie znaleziono " + links.size()+ " linków");

        WebElement clickOnMeCss = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement clickOnMeXpath = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));



        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement links2 = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));
        //driver.findElement(By.id("newPage")).click();
        //driver.close();//zamyka okno pierwotne z focusem

        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpathButton2 = driver.findElement(By.xpath("//button"));
        WebElement linksXpath = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));

        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.dismiss(); tez dizala
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Bartek");
        firstNameInput.clear();
        firstNameInput.sendKeys("Tomek");

       WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
       if(checkbox.isSelected()) {
           System.out.println("checkbox jest zaznaczony");
           checkbox.click();
           System.out.println("checkbox został odznaczony");
       }  else {
           System.out.println("checkbox nie jest zaznaczony");
       }

        */

    /*
       WebElement topsecretElement = driver.findElement(By.className("topSecret"));
       if(topsecretElement.isDisplayed()) {
           System.out.println("element jest widoczny");
           System.out.println(topsecretElement.getText());

       } else {
           System.out.println("element nie jest widoczny");
           System.out.println(topsecretElement.getAttribute("textContent"));
       }
            */








