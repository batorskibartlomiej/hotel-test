import org.testng.annotations.Test;

public class Konstruktor {

    @Test
    public void testKonstruktor() {



        Student drugiStudent = new Student("Jan", "Kowalski", "III");
   drugiStudent.sayYourName();

    }
}
