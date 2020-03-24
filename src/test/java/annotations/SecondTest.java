package annotations;

import com.travelers.helpers.TestListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class SecondTest {


    @Test(dataProvider = "getData")
    public void firstTest(String username, String password) {
        System.out.println("Login test");
        System.out.println("Username "+username);
        System.out.println("Password "+password);
        Assert.assertEquals(username,password);

    }


    @DataProvider
    public Object[][] getData() {
        return new Object[][] {{"test1", "test1"},{"test2", "test2"}};
    }
}
