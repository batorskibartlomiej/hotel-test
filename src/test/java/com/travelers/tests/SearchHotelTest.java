package com.travelers.tests;

import com.travelers.helpers.TestListener;
import com.travelers.pages.HomePage;
import com.travelers.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


@Listeners(TestListener.class)
public class SearchHotelTest extends BaseSeleniumTest {


    @Test
    public void searchHotelTest()  {
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");

        HomePage homePage = new HomePage(driver);

        ResultPage resultPage = homePage.setCityHotel("Dubai")
                 .setDateRange("09/11/2020", "10-11-2020")
                 .opemTravellersModal()
                 .addAdult()
                 .addChild()
                 .addChild()
                 .performSearch();
        //Thread.sleep(5000);



        //ResultPage resultPage = new ResultPage(driver);

        List<String> hotelNames = resultPage.getHotelNames();

        Assert.assertEquals("Jumeirah Beach Hotel", hotelNames.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelNames.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelNames.get(2));

        List<String> prices = resultPage.getHotelPrices();
        Assert.assertEquals("$22", prices.get(0));
        Assert.assertEquals("$50", prices.get(1));
        Assert.assertEquals("$85", prices.get(2));
    }


}
