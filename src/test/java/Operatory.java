import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Operatory {
@Test
    public void testOperatorow(){

        int liczbaA = 2;
        int liczbaB = 5;

        System.out.println(liczbaA>liczbaB);
        System.out.println(liczbaA == liczbaB);
        System.out.println(liczbaA != liczbaB);

    }
}
