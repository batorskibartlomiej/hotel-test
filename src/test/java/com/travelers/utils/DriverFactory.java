package com.travelers.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import java.io.File;

public class DriverFactory {

    public static WebDriver driverInstance;

    public static WebDriver getDriver(DriverType driverType) throws NoSuchDriverException {


        if (driverInstance == null) {
            getSpecificDriver(driverType);

            driverInstance.manage().window().maximize();

        }
        return driverInstance;
    }

    private static void getSpecificDriver(DriverType driverType) throws NoSuchDriverException {

        switch (driverType) {
            case IE:
                File ieExe = new File("src//main//resources//executables//drivers//IEDriverServer.exe");
                InternetExplorerDriverService ieService = new InternetExplorerDriverService.Builder()
                        .usingDriverExecutable(ieExe)
                        .usingAnyFreePort().build();
                System.out.println("zmienna zostanie zainicjowana");
                //String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
                // System.setProperty("webdriver.chrome.driver", driverPath);
                driverInstance = new InternetExplorerDriver(ieService);

                break;

            case CHROME:
                File chromeExe = new File("src//main//resources//executables//drivers//chromedriver.exe");
                ChromeDriverService chromeService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(chromeExe)
                        .usingAnyFreePort().build();
                System.out.println("zmienna zostanie zainicjowana");
                //String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
                // System.setProperty("webdriver.chrome.driver", driverPath);
                driverInstance = new ChromeDriver(chromeService);

                break;

            case FIREFOX:
                File firefoxExe = new File("src//main//resources//executables//drivers//geckodriver.exe");
                GeckoDriverService geckoDriverServiceService = new GeckoDriverService.Builder()
                        .usingDriverExecutable(firefoxExe)
                        .usingAnyFreePort().build();
                System.out.println("zmienna zostanie zainicjowana");
                //String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
                // System.setProperty("webdriver.chrome.driver", driverPath);
                driverInstance = new FirefoxDriver(geckoDriverServiceService);

                break;

            default:
                System.out.println("brak danego drivera");
                throw new NoSuchDriverException();
        }
    }

    public static void resetDriver() {

        driverInstance = null;
    }
}







