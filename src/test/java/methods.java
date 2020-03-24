import org.testng.annotations.Test;

public class methods {

    public void nazwaMetody() {

        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }


    public int sum() {

        int a = 2;

        int b = 3;

        return a + b;
    }

    int wynikDzialania = sum();

    public Student pobierzDaneStudenta() {

        Student nowy = new Student("Milena", "Kosiol", "2");

        return nowy;
    }

    @Test
    public void testMetod() {

        nazwaMetody();
        System.out.println(sum());
        System.out.println(wynikDzialania);
       Student nowy = pobierzDaneStudenta();
        System.out.println(nowy.name);
        System.out.println(nowy.surname);

        


    }



}
