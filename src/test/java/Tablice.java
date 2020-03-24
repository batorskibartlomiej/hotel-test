public class Tablice {

    int liczby[] = new int[5];

    public void ustawWartosc() {

        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;
    }

    public void wypiszElementyTablicy() {
        for(int i=0; i<liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }


    Student studenci[] = new Student[2];

    public void dodajStudentów() {
        Student pierwszy = new Student("Tomasz", "Kot", "I");
        Student drugi = new Student("Jan", "Kowalski", "II");

        studenci[0] = pierwszy;
        studenci[1] = drugi;


    }


        public void przedstawStudentow() {
        try {
            studenci[0].sayYourName();
            studenci[1].sayYourName();
            studenci[2].sayYourName();
            System.out.println("tutaj znajduje sie cos innego ");
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("wystąpił wyjątek! Odwolujesz sie do elementu tablicy ktorego nie ma");
        } finally {
            System.out.println("Zamykam połączenie do bazy danych");
        }




        }

}
