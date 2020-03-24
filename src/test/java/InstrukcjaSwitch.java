import org.testng.annotations.Test;

public class InstrukcjaSwitch {

    @Test
    public void testSwitch() {
        wypiszDzienTygodnia(2);
        wypiszDzienTygodnia(6);
        wypiszDzienTygodnia(5);
        wypiszDzienTygodnia(10);


    }

    public void wypiszDzienTygodnia(int dzienTygodnia) {
        switch(dzienTygodnia) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wendsday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
                default:
                    System.out.println("give me right number");
        }

    }
}
