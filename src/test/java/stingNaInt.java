import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



@Test
    public class stingNaInt extends BaseSeleniumTest {


    //dataElem.click();
    /*@Test
    public void dodawanie(String data) {

        if (data ==("")) {
            dataElem.sendKeys("1");
        } else {
            Integer dataPoDodaniuInt = Integer.parseInt(data1) + 1;
            System.out.println("int" + dataPoDodaniuInt);
            String dataAktualna = dataPoDodaniuInt.toString();
            dataElem.clear();
            dataElem.sendKeys(dataAktualna);
        }



    }*/


    @Test
    public void waitTest2() {

        //driver.manage().timeouts().implicitlyWait(150L, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("file:///C:/Users/bartek/Desktop/Test.html");
        WebElement dataElem = driver.findElement(By.name("username"));
        dataElem.click();


        String data1 = dataElem.getAttribute("value");






        if (data1.equals("")) {
            dataElem.sendKeys("1");
        }else if (data1.equals("100")) {
            Integer dataPoDodaniuInt = Integer.parseInt(data1) - 1;
            String dataAktualna = dataPoDodaniuInt.toString();
            dataElem.clear();
            dataElem.sendKeys(dataAktualna);
        }else {
            Integer dataPoDodaniuInt = Integer.parseInt(data1) + 1;
            System.out.println("int" + dataPoDodaniuInt);
            String dataAktualna = dataPoDodaniuInt.toString();
            dataElem.clear();
            dataElem.sendKeys(dataAktualna);
        }






    }






















}


           // System.out.println(data1);


            //Integer dataPoDodaniuInt = Integer.parseInt(data1)+1;
           // System.out.println("int"+dataPoDodaniuInt);
            //String dataAktualna = dataPoDodaniuInt.toString();

          // System.out.println("string rowna sie "+dataAktualna);

           //dataElem.sendKeys(dataAktualna);




