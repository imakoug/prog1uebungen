import java.util.Scanner;

public class Primzahlen {
    public static boolean checkPrim(int n) {
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
//        if (checkPrim(n)) {
//            System.out.println("Untersuchte Zahl " + ConsoleColors.GREEN_BOLD_BRIGHT + "ist" + ConsoleColors.RESET + " eine Primzahl!");
//        }
//        else {
//            System.out.println("Untersuchte Zahl ist " + ConsoleColors.RED_BOLD_BRIGHT +  "keine" + ConsoleColors.RESET + " Primzahl!");

//        }
        for (int i = 0; i <= n; i++) {
            if (checkPrim(i)) {
                System.out.println("Untersuchte Zahl " + ConsoleColors.GREEN_BOLD_BRIGHT + "ist" + ConsoleColors.RESET + " eine Primzahl!");
            }
            else {
                System.out.println("Untersuchte Zahl ist " + ConsoleColors.RED_BOLD_BRIGHT +  "keine" + ConsoleColors.RESET + " Primzahl!");
            }
        }
    }
}
