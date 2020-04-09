package com.travelers.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;

import static com.aventstack.extentreports.Status.*;

public class ReportTest {

    public static void main(String[] args) throws IOException {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("index.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(reporter);

        ExtentTest test = reports.createTest("Our first test");
        test.log(INFO, "firstStep");
        test.log(ERROR, "firstStep");
        test.log(DEBUG, "firstStep");
        test.pass("Test passed");
        String path = "D:\\BARTEK\\Intelij\\selenium\\src\\main\\resources\\32977000.png";
        test.pass("Description", MediaEntityBuilder.createScreenCaptureFromPath(path).build());

        reports.flush();
        reporter.flush();
    }
}
