package lek3;
import java.util.Scanner;
public class GueltigeUhrzeit {
    public static void main(String[] args) {
        System.out.println("\n-----UHRZEIT TESTER-----\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Stunden ein: ");
        int stunden = sc.nextInt();
        System.out.print("Geben Sie die Minuten ein: ");
        int minuten = sc.nextInt();
        System.out.print("Geben Sie die Sekunden ein: ");
        int sekunden = sc.nextInt();

        if (stunden > 23 || minuten > 59 || sekunden > 59) {
            System.out.println("Die Uhrzeit ist nicht gueltig!");
        } else {
            System.out.println("Die Uhrzeit ist gueltig.");
        }

    }
}
