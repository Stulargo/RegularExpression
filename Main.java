import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String tekst = "abc123";
        String tekst2 = "7891234560";
        //String tekst3 ="xd";

        System.out.println(tekst.matches("^[a-zA-Z0-9]{6}$"));
        //System.out.println("a1".matches("^[a-zA-Z0-9]{6}$"));

        System.out.println(tekst2.matches("[789]\\d{9}"));

        //System.out.println(tekst3.matches("^[XxDd207]{8}$"));



        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj haslo");

        String haslo = scanner.nextLine();


        if (haslo.matches("^[XxDd]{8}$")) {
            System.out.println("Haslo jest poprawne");
        } else {
            System.out.println("Haslo jest niepoprawne ");
        }

    }
}
