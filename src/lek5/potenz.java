package lek5;
import java.util.Scanner;
public class potenz {

    public static double power (double b, int n) {
        double res = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            res *= b;
        }
        if (n > 0) return res;
        if (n < 0) return 1/res;
        return 1;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Basis b ein: ");
        double b = sc.nextDouble();
        System.out.print("Geben Sie den Exponent n ein: ");
        int n = sc.nextInt();
        sc.close();
        double erg = power(b,n);
        System.out.println("Ergebnis: " + erg);
    }
}
