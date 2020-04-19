package com.travelers.pages;

import com.travelers.helpers.SeleniumHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultPage {

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;


    private SeleniumHelper helper;

    private Logger log = Logger.getLogger(ResultPage.class);

    public ResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        helper = new SeleniumHelper(driver);

    }


    public List<String> getHotelNames() throws InterruptedException {
        log.info("Checking hotel names ");
        List<String> hotelNames = new ArrayList<>();
        Thread.sleep(500);
        helper.waitForListOfWebElement(resultsTable.findElements(By.xpath("//h4//b")));
        List<WebElement> hotelNamesWebElements = resultsTable.findElements(By.xpath("//h4//b"));

        for (WebElement hotelNameElement : hotelNamesWebElements) {
            log.info(hotelNameElement.getText());
            hotelNames.add(hotelNameElement.getText());
        }
        return hotelNames;
    }


    public List<String> getHotelPrices() {

       /* List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        hotelPrices.stream().forEach(hotelPrice ->
                System.out.println(hotelPrice.getText()));
        */
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        return hotelPrices.stream().map(WebElement::getText).collect(Collectors.toList());

    }

}
