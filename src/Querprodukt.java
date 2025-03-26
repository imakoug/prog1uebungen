import java.util.Scanner;

public class Querprodukt {
    public static int querProdukt(int n) {
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            n /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Geben Sie bitte eine Zahl ein: ");
            int n = sc.nextInt();
            if (n <= 0 || n > 1000000) {
                System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "FEHLER" + ConsoleColors.RESET + " – Zahl ist ungültig.");
            } else {
                System.out.println("Das Querprodukt der Zahl " + n + " beträgt " + querProdukt(n));
                break;
            }
        }
    }
}
