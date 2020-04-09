package com.travelers.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.travelers.helpers.SeleniumHelper;
import com.travelers.utils.DriverFactory;
import com.travelers.helpers.DriverType;
import com.travelers.helpers.NoSuchDriverException;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public abstract class BaseSeleniumTest {


    protected WebDriver driver;
    protected ExtentHtmlReporter reporter;
    protected ExtentReports reports;


    @BeforeTest
    public void setUpReporter(){
        reporter = new ExtentHtmlReporter("src//main//resources//reports//index.html");
        reports = new ExtentReports();
        reports.attachReporter(reporter);

    }

    @BeforeMethod
    public void setUp() throws NoSuchDriverException {

        System.out.println("Przed testem");
        String driverPath = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);


        driver = DriverFactory.getDriver(DriverType.CHROME);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Po tescie");
        driver.quit();
        DriverFactory.resetDriver();


    }
    @AfterTest
    public void tearDownReporter(){
        reporter.flush();
        reports.flush();


    }

    protected MediaEntityModelProvider getScreenshot() throws IOException {
        return  MediaEntityBuilder.createScreenCaptureFromPath(SeleniumHelper.takeScreenshot(driver)).build();
    }









}
