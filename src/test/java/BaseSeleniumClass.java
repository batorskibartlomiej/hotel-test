public class BaseSeleniumClass {


    public String first = "publiczny";

    String second = "bez";

    protected  String third = "protected";

    private String fourth = "private";

    public void checkAccess(){

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
