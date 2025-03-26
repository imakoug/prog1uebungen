import java.util.Scanner;

public class Potenz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGeben Sie die Basis ein: ");
        double b = sc.nextDouble();
        System.out.print("Geben Sie den Exponent ein: ");
        int n = sc.nextInt();
        double res = 1.0;
        if (n == 0) System.out.println("\nErgebnis: 0");
        else if (n > 0) {
            for (int i = 0; i < n; i++) {
                res *= b;
            }
            System.out.println("\nErgebnis: " + res);
        }
        else  if (n < 0) {
            for (int i = 0; i > n; i--) {
                res *= b;
            }
            System.out.println("\nErgebnis: " + 1.0/res);
        }
    }
}
