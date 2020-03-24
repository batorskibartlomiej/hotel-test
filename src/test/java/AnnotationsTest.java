import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AnnotationsTest extends BaseSeleniumTest {

    @FindBys({
            @FindBy(tagName = "table"),
            @FindBy(className = "tableHeader")

    })
    private List<WebElement> elements;


    @FindBy(xpath = "//input")
    private List<WebElement> inputs;
    @FindBy(xpath = "//buttonn  ")
    private List<WebElement> buttons;

    @FindAll({
            @FindBy(xpath = "//input"),
            @FindBy(xpath = "//button")
    })
    private List<WebElement> inputsAndButtons;



    @Test
    public void googleOpenTest() {

        SeleniumHelper helper = new SeleniumHelper(driver);
        PageFactory.initElements(driver, this);
        driver.get("file:///C:/Users/bartek/Desktop/Test.html");
        System.out.println("inupts size is "+inputs.size());
        System.out.println("buttons size is "+buttons.size());
        System.out.println("inuptsAndButtons size is "+inputsAndButtons.size());
        System.out.println("to koniec");

    }

























    }
