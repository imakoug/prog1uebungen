package lek5;
import java.util.Scanner;
public class Rechtecknaeherung {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Anzahl der Rechtecke ein: ");
        int n = scanner.nextInt();

        double breite = 1.0 / n;
        double summe = 0.0;

        for (int i = 0; i < n; i++) {
            double x = (i + 0.5) * breite;
            double hoehe = Math.sqrt(1 - x * x);
            summe += breite * hoehe;
        }

        double pi = summe * 4;
        System.out.println("Näherung von π: " + pi);
    }
}
