package lek3;
import java.util.Scanner;

public class Einzelzeichen {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie ein Einzelzeichen ein: ");
        char c = sc.next().charAt(0);
        boolean ausgabe = false;

        if (Character.isUpperCase(c)) {
            System.out.println("Großbuchstabe");
            ausgabe = true;
        }
        if (c >= '0' && c <= '9' || c >= 'a' && c <= 'f' || c >= 'A' && c <= 'F') {
            System.out.println("Hexadezimale Ziffer");
            ausgabe = true;
        }
        if (c == '1'|| c == '0') {
            System.out.println("Binäre Ziffer");
            ausgabe = true;
        }
        if (c >= '0' && c <= '7') {
            System.out.println("Oktale Ziffer");
            ausgabe = true;
        }
        if (!ausgabe) {
            System.out.println("Unbekannt");
        }
    }
}
