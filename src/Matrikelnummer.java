import java.util.Scanner;

public class Matrikelnummer {
    public static boolean checkMatrikel(String matrikel) {
        if (matrikel.length() != 7) return false;
        else if (matrikel.charAt(0) == '5' && matrikel.charAt(1) == '1' || matrikel.charAt(0) == '5' && matrikel.charAt(1) == '0' || matrikel.charAt(0) == '6' && matrikel.charAt(1) == '0') {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n --------------Matrikelnummer Checker--------------\n\n");
        System.out.print("Geben Sie die Matrikelnummer ein: ");
        int matrik = sc.nextInt();
        String matriker = Integer.toString(matrik);

        if (!checkMatrikel(matriker)) {
            System.out.println("Matrikelnummer ist " + ConsoleColors.RED_BOLD_BRIGHT + "nicht" + ConsoleColors.RESET + " gültig!");
        } else System.out.println("Matrikelnummer " + ConsoleColors.GREEN_BOLD_BRIGHT + "ist" + ConsoleColors.RESET + " gültig!");

    }
}
