import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseSeleniumTest {



    @Test
    public void dragAndDropTest() {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement elemntToDrop = driver.findElement(By.id("droptarget"));

        Actions action = new Actions(driver);
        action.dragAndDrop(elementToDrag,elemntToDrop).build().perform();



        String ok = elemntToDrop.getText();
        Assert.assertEquals("You did great!",ok);
        System.out.println(ok);



    }
}
