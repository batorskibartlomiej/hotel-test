package com.travelers.tests;

import com.travelers.exceptions.NoSuchDriverException;
import com.travelers.utils.DriverFactory;
import com.travelers.utils.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSecond {


    @Test
    public void searchForFacebookTest() throws NoSuchDriverException {
        DriverFactory.getDriver(DriverType.CHROME).manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
        DriverFactory.getDriver(DriverType.CHROME).get("https://www.google.pl/");
        DriverFactory.getDriver(DriverType.CHROME).findElement(By.name("q")).sendKeys("Facebook");
        DriverFactory.getDriver(DriverType.CHROME).findElement(By.name("q")).sendKeys(Keys.ENTER);
        DriverFactory.getDriver(DriverType.CHROME).findElement(By.xpath("//h3[text() ='Facebook – zaloguj się lub zarejestruj']")).click();
        System.out.println(DriverFactory.getDriver(DriverType.CHROME).getTitle());
    }
}
