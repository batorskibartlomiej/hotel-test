import org.testng.annotations.Test;

public class Zmienne {

    int First;
    int Second;

    int sum;

    int Third = 3;

    String naszeImie = "Bartek";
    @Test
    public void suma(){
        First = 2;
        Second = 5;
        sum = First + Second;
        System.out.println(sum);

    }
}
