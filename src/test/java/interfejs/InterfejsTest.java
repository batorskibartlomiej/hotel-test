package interfejs;

import org.testng.annotations.Test;

public class InterfejsTest {


    @Test
    public void interfejsTest() {
        Auto auto  = new PodstawoweAuto();
        zaprezentujAuto(auto);
       /* auto.jedz();
        auto.zmienBieg();
        auto.toJestMetodaSpecyficzna();*/

        Auto autoPremium = new AutoPremium();
        zaprezentujAuto(autoPremium);

        /*autoPremium.jedz();
        autoPremium.zatrzymaj();
        autoPremium.specyficznaMetodaPremium();*/


    }

    public void zaprezentujAuto(Auto auto) {

        auto.jedz();
        auto.zatrzymaj();
        auto.zmienBieg();
    }



}
