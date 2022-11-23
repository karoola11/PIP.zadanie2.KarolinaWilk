import java.util.Scanner;

public class Zadanko3 {
    public static void main(String[] args) {
//Zad 4

        Scanner zadanie2 = new Scanner(System.in);

        int liczba1 = zadanie2.nextInt();
        int liczba2 = zadanie2.nextInt();
        var warunek = zadanie2.next();

        switch (warunek) {

            case "ADD":
                System.out.println(liczba1 + liczba2);
                break;
            case "SUB":
                System.out.println(liczba1 - liczba2);
                break;
            case "DIV":
                switch (liczba2) {
                    case 0:
                        System.out.println("Dzielenie przez 0");
                        break;
                    default:
                        System.out.println(liczba1 / liczba2);
                        break;
                }
            case "MUL":
                System.out.println(liczba1 * liczba2);
                break;
            default:
                System.out.println("Brak takiej operacji");
                break;


            //Modyfikacja Zad 3 (Zad 4)

//                switch (warunek) {
//
//                    case "ADD":
//                        System.out.println(absoluteValue(liczba1 + liczba2));
//                        break;
//                    case "SUB":
//                        System.out.println(absoluteValue(liczba1 - liczba2));
//                        break;
//                    case "DIV":
//                        switch (liczba2) {
//                            case 0:
//                                System.out.println("Dzielenie przez 0");
//                                break;
//                            default:
//                                System.out.println(absoluteValue(liczba1 / liczba2));
//                                break;
//                        }
//                    case "MUL":
//                        System.out.println(absoluteValue(liczba1 * liczba2));
//                        break;
//                    default:
//                        System.out.println("Brak takiej operacji");
//                        break;

            //   private static int absoluteValue(int a) {
            // return (Math.abs(a));
        }
    }
}


