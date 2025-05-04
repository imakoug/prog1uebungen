package lek4;

import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        final double g = 9.80665;
        System.out.print("Geben Sie die Falldauer ein: ");
        int t = sc.nextInt();
        for (int i = 1; i <= t; i += 5) {
            double zs = 1.0/2 * g * i;
            System.out.println("Zeit: " + i + " Sekunden: " + "Zurückgelegte Strecke: " + zs + "m");
            Thread.sleep(1000);
        }
    }
}
