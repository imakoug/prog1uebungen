package lek3;

import java.util.Scanner;

public class pizzarechner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = Math.PI;
        System.out.print("Geben sie den Durchmesser der ersten Pizza: ");
        int diam1 = sc.nextInt();
        System.out.print("Geben sie den Preis der ersten Pizza: ");
        double preis1 = sc.nextDouble();

        System.out.print("Geben sie den Durchmesser der zweiten Pizza: ");
        int diam2 = sc.nextInt();
        System.out.print("Geben sie den Preis der zweiten Pizza: ");
        double preis2 = sc.nextDouble();

        double flaeche1 = pi * Math.pow(((double)diam1/2), 2);
        double flaeche2 = pi * Math.pow((double)diam2/2, 2);
        double verhalt1 = flaeche1 / preis1;
        double verhalt2 = flaeche2 / preis2;
        System.out.println(Double.compare(verhalt1, verhalt2));

        if (verhalt1 > verhalt2) {
            System.out.println("\nDie erste Pizza hat bessere Größen‐/Preisverhältnis");
        } else if (verhalt1 < verhalt2) {
            System.out.println("\nDie zweite Pizza hat bessere Größen‐/Preisverhältnis");
        } else {
            System.out.println("Beide Pizzen sind im Preis-Leistung-Verhaeltnis gleich.");
        }
    }
}
