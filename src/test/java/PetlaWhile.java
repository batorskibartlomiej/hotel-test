import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaWhile {


    @Test
    public void testPetliWhile() {

        int index = 0;

        while(index<100) {
            System.out.println(index);
            index ++;
        }

        List<String> owoce = Arrays.asList("Jablko", "Banan", "Pomarańcza");
         int index2 = 0;
        while(index2 < owoce.size()) {
            System.out.println(owoce.get(index2));
            index2++;

        }

    }
}
