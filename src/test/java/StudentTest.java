import org.testng.annotations.Test;

public class StudentTest {


    @Test
    public void testStudent() {

        Student firstStudent = new Student("tomasz","chada","III");


        firstStudent.sayYourName();

        Student secondStudent = new Student("Piotrek", "Musial","II");


        secondStudent.sayYourName();
    }
}
