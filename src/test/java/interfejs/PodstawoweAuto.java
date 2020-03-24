package interfejs;

public class PodstawoweAuto implements Auto {



    private String model = "Tipo";
    private String marka = "Fiat";


    public void toJestMetodaSpecyficzna() {
        System.out.println("Metoda dla posiadaczy auta w wersji podstawowej -" + model );
    }


    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowym autem");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz podstawowowe auto");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwierasz podstawowe szyby");

    }

    @Override
    public void zmienBieg() {

        System.out.println("Zmieniasz recznie bieg");

    }
}


