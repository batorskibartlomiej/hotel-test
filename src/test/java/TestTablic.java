import org.testng.annotations.Test;

public class TestTablic {

    @Test
    public void testTablic() {

        Tablice tablice = new Tablice();
       // tablice.ustawWartosc();
        //tablice.wypiszElementyTablicy();


        tablice.dodajStudentów();
        tablice.przedstawStudentow();

    }


}
