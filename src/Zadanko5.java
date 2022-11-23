
import java.util.Scanner;

public class Zadanko5 {
    public static void main(String[] args) {
        System.out.println("""
                Witamy w kantorze!
                Wybierz walutę:
                    1 - PLN
                    2 - JPY""");

        double a = zeskanujLiczbe();
        if (a == 1) {
            System.out.println("Wprowadź kwotę:");
            double PLN = zeskanujLiczbe();
            double JYP = 30.81;
            double wynik = PLN * JYP;
            System.out.println(PLN + "zł =>" + (String.format("% .2f", wynik)) + " ¥ ");
        }
        if (a == 2) {
            System.out.println("Wprowadź kwotę:");
            double JYP = zeskanujLiczbe();
            double PLN = 0.032;
            double wynik = JYP * PLN;
            System.out.println(JYP + " ¥ =>" + (String.format("% .2f", wynik)) + " PLN ");

        }
    }



    public static Double zeskanujLiczbe () {
        return new Scanner(System.in).nextDouble();
        }

}




