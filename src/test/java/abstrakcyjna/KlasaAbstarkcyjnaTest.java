package abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstarkcyjnaTest {


    @Test
    public void testKlasyAbstarkcyjnej() {

        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.napijSieWody();
        reksio.wypiszPrzysmak();
        System.out.println(reksio.nazwa);

        Ptak tweety = new Ptak();
        tweety.nazwa = "ptak";
        tweety.poruszajSie();
        tweety.napijSieWody();
        tweety.wypiszPrzysmak();
        System.out.println(tweety.nazwa);

        System.out.println(reksio.nazwa);
    }
}
