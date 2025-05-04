package lek3;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie eine ganze Zahl: ");
        int zahl = sc.nextInt();
        if (zahl % 7 == 0) {
            System.out.println("Die Zahl ist ganzzahlig durch 7 teilbar");
        } else {
            System.out.println("Die Zahl ist nicht ganzzahlig durch 7 teilbar");
        }
    }
}
