package lek3;
import java.util.Scanner;
public class Wahrheitstabelle {
    public static void main(String[] args) {
        System.out.println("\n-----WAHRHEITSTABELLE-----");
        System.out.println("\nZeichen ‘f‘ für false und Zeichen ‘t‘ für true");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGeben Sie das erste Zeichen ein: ");
        char zeichen = sc.next().charAt(0);
        System.out.print("Geben Sie das zweite Zeichen ein: ");
        char zeichen1 = sc.next().charAt(0);
        boolean zIstFalse = zeichen == 'f';
        boolean z1IstFalse = zeichen1 == 'f';

        if (zeichen != 'f' && zeichen != 't' || zeichen1 != 'f' && zeichen1 != 't') {
            throw new RuntimeException("Keine gueltige Kombination wurde eingegeben");
        } else {
            if (zIstFalse && z1IstFalse) {
                System.out.println("Ausgabewert: " + 0);
            }
            if (!zIstFalse && z1IstFalse) {
                System.out.println("Ausgabewert: " + 3);
            }
            if (zIstFalse && !z1IstFalse) {
                System.out.println("Ausgabewert: " + 1);
            }
            if (!zIstFalse && z1IstFalse) {
                System.out.println("Ausgabewert: "+ 2);
            }
        }
    }
}
