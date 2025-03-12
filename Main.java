public class Main {
    public static void main(String[] args) {
        String tekst = "abc123";
        String tekst2 = "7891234560";

        System.out.println(tekst.matches("^[a-zA-Z0-9]{6}$"));
        //System.out.println("a1".matches("^[a-zA-Z0-9]{6}$"));

        System.out.println(tekst2.matches("[789]\\d{9}"));


       
    }
}
