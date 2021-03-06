package com.travelers.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.travelers.helpers.ExcelHelper;
import com.travelers.helpers.SeleniumHelper;
import com.travelers.helpers.TestListener;
import com.travelers.pages.HomePage;
import com.travelers.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


@Listeners(TestListener.class)
public class SearchHotelTest extends BaseSeleniumTest {


    @Test(dataProvider = "getData")
    public void searchHotelTest(String city, String checkInDate, String checkOutDate, String fHotel, String fPrice,String sHotel, String sPrice, String tHotel, String tPrice) throws InterruptedException, IOException {



      ExtentTest test=reports.createTest("Search Hotel Test");
       //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");

        HomePage homePage = new HomePage(driver);


        test.info("On PHP Travels Home Page", getScreenshot());

       homePage
                .setCityHotel(city)
                .setDateRange(checkInDate,checkOutDate)
                .opemTravellersModal()
                .addAdult()
                .addChild()
                .addChild();
       String infoText = "Before performing search with city %s, check in %s and check out %s";
       test.info(String.format(infoText, city, checkInDate,checkOutDate) , getScreenshot());
       ResultPage resultPage = homePage.performSearch();
       test.info("After performing search", getScreenshot());
        //Thread.sleep(5000);



        //ResultPage resultPage = new ResultPage(driver);
        test.info("Checking hotel names and prices", getScreenshot());
        List<String> hotelNames = resultPage.getHotelNames();

        Assert.assertEquals(fHotel, hotelNames.get(0));
        Assert.assertEquals(sHotel, hotelNames.get(1));
        Assert.assertEquals(tHotel, hotelNames.get(2));

        List<String> prices = resultPage.getHotelPrices();
        Assert.assertEquals( prices.get(0),fPrice);
        Assert.assertEquals( prices.get(1),sPrice);
        Assert.assertEquals( prices.get(2),tPrice);
    }
    @DataProvider
    public Object[][] getData() {
        Object [][] data = null;
        try {
            data = ExcelHelper.readExcelFile(new File("src//test/resources//files/Dane.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public MediaEntityModelProvider getScreenshot() throws IOException {
        return  MediaEntityBuilder.createScreenCaptureFromPath(SeleniumHelper.takeScreenshot(driver)).build();
    }


}
