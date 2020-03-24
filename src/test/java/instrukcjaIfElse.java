import org.testng.annotations.Test;

public class instrukcjaIfElse {


    @Test

    public void testInstrukcji(){
        sprawdzWiek(17);
        sprawdzWiek(20);


    }


    public void sprawdzWiek(int wiek) {

        if(wiek< 18) {

            System.out.println("dorośnij nie pij!!");
        } else {
            System.out.println("brawo dorosłeś:)");
        }
    }
}
