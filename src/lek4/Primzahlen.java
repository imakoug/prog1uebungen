package lek4;

import java.util.Scanner;

public class Primzahlen {
    public static boolean checkPrim(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte zu untersuchende Zahl eingeben: ");
        int n = sc.nextInt();
        if (checkPrim(n)) {
            System.out.println("Untersuchte Zahl ist eine Primzahl!");
        }
        else {
            System.out.println("Untersuchte Zahl ist keine Primzahl!");
        }
//        for (int i = 0; i <= n; i++) {
//            if (checkPrim(i)) {
//                System.out.println("Untersuchte Zahl ist eine Primzahl!");
//            }
//            else {
//                System.out.println("Untersuchte Zahl ist keine Primzahl!");
//            }
//        }
//    }
    }
}
