import org.testng.annotations.Test;

@Test
public class Student {

     public String name;

     public String surname;

     public int Age;

     public String group;

     public void sayYourName() {

         System.out.println("Cześć! Nazywam się "+name +" "+ surname);
     }

     public Student() {

          System.out.println("Hello witaj w konstruktorze");
     }

     public Student(String noweImie, String noweNazwisko, String nowaGrupa) {
          name = noweImie;
          surname = noweNazwisko;
          group = nowaGrupa;
     }
}
