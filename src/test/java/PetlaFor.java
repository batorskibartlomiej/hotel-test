import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaFor {


    @Test
    public void wypiszLiczby() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        List<String> studenci = Arrays.asList("Tomek", "Mariusz", "Andrzej", "Kasia", "Marysia");

        for (String x : studenci) {
            System.out.println(x);

        }

        for (int index = 0; index < studenci.size(); index ++) {
System.out.println("Student numer " + index + " to " + studenci.get(index));
}

}
}