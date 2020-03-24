import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhile {


    @Test
    public void testPetliDoWhile() {


        int index = 0;
        do {
            System.out.println(index);
            index++;


        }while (index<5);//kod zawarty w do wykona sie zawsze chociaz raz pomimo nawet wadliwegowarunku

        List<String> rzeczy = Arrays.asList("Lampa", "Stolik", "Sofa");

        int index2=0;

        do {
            System.out.println(rzeczy.get(index2));
            index2++;
        }while (index2<rzeczy.size());


    }
}
