import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie eine Jahreszahl ein: ");
        int zahl = sc.nextInt();
        if (zahl < 0) System.out.println("Die Zahl muss positiv sein!");
        if (zahl % 4 == 0 && zahl % 100 != 0 || zahl % 400 == 0) System.out.println("Ist ein Schaltjahr!");
        else System.out.println("Ist kein Schaltjahr..");
    }
}
