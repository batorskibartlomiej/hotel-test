package dziedziczenie;

public class Dziecko extends Rodzic {


    protected String kolorOczu = "zielony";

    public void wypiszMojeKolorOczu() {
        System.out.println("Moj kolor oczu to " + kolorOczu);



    }



    public void wypiszKolorWlosow() {

        System.out.println("moj kolor wlosow to "+ kolorWlosow);
    }


    public void wypiszTypCeryIsklonnoscDoTycia() {

        System.out.println("moja cera jest "+ typCery + " sklonnosc do "+sklonnoscDoTycia);
    }
    @Override
    public void probujePlywac() {
        System.out.println("Być może nie umiem pływać, jestem jeszcze za młody");
    }



}
