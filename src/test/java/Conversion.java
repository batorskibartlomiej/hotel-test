import org.testng.annotations.Test;

public class Conversion {
    @Test
    public void ConversionTest() {

        int a = 1;
        double b = 2.0;
        double c = a + b;
        System.out.println(c);
        int d  = a + (int)b;
        System.out.println(d);
    }
}
