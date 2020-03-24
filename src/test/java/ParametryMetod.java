import org.testng.annotations.Test;

public class ParametryMetod {

    public int suma(int pierwszaLiczba, int drugaLiczba) {

        return  pierwszaLiczba + drugaLiczba;


    }

    public void sayYourName(String imie) {

        System.out.println("Witaj " + imie);
    }

    @Test
    public void testParametrow() {

        int sumaLiczb = suma(10, 2);
        System.out.println(sumaLiczb);
        System.out.println(suma(10, 2));
        sayYourName("bartek");
    }
}
