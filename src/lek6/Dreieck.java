package lek6;

public class Dreieck {

    public static void dreieck(int zeilen) {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }

    public static void bessererDreieck(int zeilen) {
        for (int i = 1; i <= zeilen; i++) {
            for (int j = 1; j <= zeilen - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        bessererDreieck(5);
    }

}
