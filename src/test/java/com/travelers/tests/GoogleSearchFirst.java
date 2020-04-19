package com.travelers.tests;

import com.travelers.exceptions.NoSuchDriverException;
import com.travelers.utils.DriverFactory;
import com.travelers.utils.DriverFactory2;
import com.travelers.utils.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchFirst {



    @Test
    public void searchForSeleniumTest()  {
        DriverFactory2.getDriver().manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        DriverFactory2.getDriver().get("https://www.google.pl/");
        DriverFactory2.getDriver().findElement(By.name("q")).sendKeys("Selenium");
        DriverFactory2.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
        DriverFactory2.getDriver().findElement(By.xpath("//h3[text() ='Selenium']")).click();
        System.out.println(DriverFactory2.getDriver().getTitle());
    }
    @Test
    public void searchForAllegroTest()  {
        DriverFactory2.getDriver().manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        DriverFactory2.getDriver().get("https://www.google.pl/");
        DriverFactory2.getDriver().findElement(By.name("q")).sendKeys("Allegro");
        DriverFactory2.getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
        DriverFactory2.getDriver().findElement(By.xpath("//h3[text() ='Allegro - atrakcyjne ceny i 100% bezpieczeństwa']")).click();
        System.out.println(DriverFactory2.getDriver().getTitle());
    }
}
