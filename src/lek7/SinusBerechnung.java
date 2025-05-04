package lek7;
import lek6.*;
import java.util.Scanner;
public class SinusBerechnung {

    public static double sin(double x) {
        double summe = 0;
        for (int k = 0; k < 15; k++) {
            summe += PotenzRekursion.potenz(-1, k) * (PotenzRekursion.potenz(x, 2*k + 1) / SchleifenFakultaet.fakultaet(2*k + 1));
        }
        return summe;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie X ein: ");
        double x = sc.nextDouble();
        System.out.println("Ergebnis fuer sin(" + x + ") = " + sin(x));

    }
}
