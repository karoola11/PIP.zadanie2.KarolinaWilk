//public class Zjazd2 {
//    public static void main(String[] args) {
//
//        //zad 1
//
//        Scanner zadanie3 = new Scanner(System.in);
//        System.out.println("Wpisz swoje imie i nacisnij ENTER");
//        String firstName = zadanie3.nextLine();
//        System.out.println("Podaj swoje nazwisko i nacisnij ENTER ");
//        String secondName = zadanie3.nextLine();
//        System.out.println("Wprowadź swoj numer studenta (bez 's') i nacisnij ENTER");
//        int numer_studenta = zadanie3.nextInt();
//        zadanie3.nextLine();
//        System.out.println("Hello" + " " + firstName + " " + secondName + " " + "s" + numer_studenta + " !");
//        zadanie3.close();
//
//        //zad 2
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Wprowadz double a i nacisnij ENTER:");
//        double a = scanner.nextDouble();
//        System.out.println("Wprowadz double b i nacisnij ENTER:");
//        double b = scanner.nextDouble();
//        double suma = a + b;
//        System.out.println("Suma: " + suma);
//        double roznica = a - b;
//        System.out.println("Roznica: " + roznica);
//        if (a == 0 | b == 0) {
//            System.out.println("Wynik sprzeczny - jedna ze zmiennych jest rowna 0");
//        } else {
//            double odwrotnosc = (1 / a) + (1 / b);
//            System.out.println("Suma odwrotnosci: " + odwrotnosc);
//            scanner.close();
//        }
//
//        //zad3
//
//        double num1 = (77.0 - 37) / (11 + 3 * 2 - 7);
//        double num2 = (2.0 * 6 + 3 * 5) / (5 * 5 - (7 + 3) * 2);
//        double numfinal = 1 + num1 + num2;
//        System.out.println(numfinal);
//
//        //zad 4
//
//        // we can define 'scanner' here - but it is already done above.
//        // Scanner scanner = new Scanner(System.in);
//
//        float x = scanner.nextFloat();
//        boolean check = (x < -4 || x >= 3 && x <= 10);
//        System.out.println(check);
//
//    }
//}
