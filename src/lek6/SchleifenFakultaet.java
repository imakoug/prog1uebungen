package lek6;
import java.util.Scanner;

public class SchleifenFakultaet {

    public static long fakultaet (int zahl) {
        long res = 1;
        for (int i = 2; i <= zahl; i++) {
            res *= i;
        }
        return res;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebein Sie die Zahl ein: ");
        int zahl = sc.nextInt();
        System.out.println("Fakultaet der Zahl: " + fakultaet(zahl));

    }
}
