package com.travelers.pages;

import com.travelers.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id = 'select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy(name= "checkin")
    private WebElement checkInInput;

    @FindBy(name= "checkout")
    private WebElement checkOutInput;

    @FindBy(name= "travellers")
    private WebElement travellersInput;

    @FindBy(id= "adultPlusBtn")
    private WebElement adultPlusBtn;

    @FindBy(id= "childPlusBtn")
    private WebElement childPlusBtn;

    @FindBy(xpath = "//button[text()= ' Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;


    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement selectResult;


    private SeleniumHelper helper;

    private WebDriver driver;


    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver,this);//inicjuzyje wszytskie elementy
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;


    }

    public HomePage setCityHotel(String cityName)  {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);

        /*By locationLabel = By.xpath("//div[@class='select2-result-label']");
        helper.waitForElementToBeDisplayed(locationLabel);
       // Thread.sleep(5000);//zamiast sleepa to co wyzej*/

        //WebElement element = driver.findElement(By.xpath("//div[@class='select2-result-label']"));zastapione findBy wyzej
        helper.waitForElementToBeDisplayed(selectResult);

        searchCityInput.sendKeys(Keys.ENTER);
        return this;

    }

    public HomePage setDateRange(String checkInDate, String checkOutDate) {
        checkInInput.click();
        checkInInput.sendKeys(checkInDate);
        checkOutInput.click();
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
        return this;


    }

    public HomePage opemTravellersModal() {

        travellersInput.click();
        helper.waitForElementToBeDisplayed(adultPlusBtn);
        return this;
    }

    public ResultPage performSearch() {
        searchButton.click();
        return new ResultPage(driver);
    }

    public HomePage addAdult() {
        adultPlusBtn.click();
        return this;
    }

    public HomePage addChild() {
        childPlusBtn.click();
        return this;
    }








}
