package realTest;

public class TestA {

    public static void main(String[] args) {


        System.out.println("aaaa");

        String s = "asd";
        try {
            String a = s.substring(0,4);
        } catch (Exception e) {
            e.getMessage();
            System.out.println("e :: " + e);
        }


    }

}
