import java.util.Scanner;

public class Zadanko2 {
    public static void main(String[] args) {
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po kazdej z nich:");
        double a = zeskanujLiczbe();
        double b = zeskanujLiczbe();
        if (a == b) {
            System.out.println("Liczby sa sobie rowne");
        } else if (a > b) {
            double c = a;
            a = b;
            b = c;
        }
        System.out.println("Wybrany przedzial: " + "[" + a + ", " + b + "]");

        System.out.println("Wartosci generowane losowo:");

        double wartosc1 = RandomowaLiczba(a, b);
        double wartosc2 = RandomowaLiczba(a, b);
        double wartosc3 = RandomowaLiczba(a, b);

        System.out.println("    " + (String.format("%.2f", wartosc1)) + "\n" + "    " + (String.format("%.2f", wartosc2)) + "\n" + "    " + (String.format("%.2f", wartosc3)));

        double wartosc4 = Math.min(wartosc1, wartosc2);

        double wartoscmin = Math.min(wartosc4, wartosc3); //wartoscmin

        double wartosc5 = Math.max(wartosc1, wartosc2);

        double wartoscmax = Math.max(wartosc5, wartosc3); //wartoscmax

        double sumawartosci = wartosc1 + wartosc2 + wartosc3;

        double wartoscavg = sumawartosci - wartoscmax - wartoscmin; //wartoscavg

        System.out.println("Gdzie: " + (String.format("%.2f", wartoscmin)) + " < " + (String.format("%.2f", wartoscavg)) + " < " + (String.format("%.2f", wartoscmax)));

    }

    public static Double zeskanujLiczbe() {
        return new Scanner(System.in).nextDouble();
    }

    public static double RandomowaLiczba(double min, double max) {
        return  ((Math.random() * (max - min)) + min);



    }

}
