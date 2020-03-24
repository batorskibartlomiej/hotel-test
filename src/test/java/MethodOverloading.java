import org.testng.annotations.Test;

public class MethodOverloading {

    @Test
    public void methodOverloadingTest() {

        Select autoSelect = new Select();
    autoSelect.selectBy(1);
    autoSelect.selectBy("Volvo");

    }
    }
