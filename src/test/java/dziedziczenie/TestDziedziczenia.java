package dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {

    @Test
    public void testDziedziczenia() {

        

        Dziecko dziecko = new Dziecko();
       dziecko.wypiszMojeKolorOczu();
       dziecko.probujePlywac();

       Rodzic rodzic = new Rodzic();
        rodzic.probujePlywac();

        dziecko.wypiszKolorWlosow();
        dziecko.wypiszTypCeryIsklonnoscDoTycia();

        if(dziecko.sklonnoscDoTycia) {
            System.out.println("to wszystko wina rodzicow");
        }




    }
}
