package interfejs;

public class AutoPremium implements Auto {
    @Override
    public void jedz() {
        System.out.println("jedz autem premium");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("zatrzymujesz sie premium autem");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwierasz szybe premium");

    }

    @Override
    public void zmienBieg() {
        System.out.println("zmieniam bieg premium");

    }

    public void specyficznaMetodaPremium() {

        System.out.println("AUTO PREMIUM");
    }
}
