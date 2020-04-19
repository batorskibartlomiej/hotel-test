package com.travelers.helpers;

import com.travelers.exceptions.NoSuchDriverException;
import com.travelers.utils.DriverFactory;
import com.travelers.utils.DriverType;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestListener implements ITestListener {

    Logger log = Logger.getLogger(TestListener.class);
    @Override
    public void onTestStart(ITestResult iTestResult) {
        log.debug("On test start");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.debug("On test success");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try {
            log.debug("On test failure");
            SeleniumHelper.takeScreenshot(DriverFactory.getDriver(DriverType.CHROME));
        }catch (IOException  | NoSuchDriverException e) {
           log.error(e.getStackTrace());


        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.debug("On test skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("On test failed but within percentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        log.debug("On start");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        log.debug("On finish");
    }
}
