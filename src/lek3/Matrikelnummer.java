package lek3;

import java.util.Scanner;

public class Matrikelnummer {
    public static boolean checkMatrikel(int matrik) {
       /* if (matrik.length() != 7) return false;
        else if ((matrik.charAt(0) == '5' && (matrik.charAt(1) == '1' || matrik.charAt(1) == '0') ) ||  matrik.charAt(0) == '6' && matrik.charAt(1) == '1') {
            return true;
        } else return false;*/

        String matrikelStr = ""+matrik;
        if (matrikelStr.length() != 7) return false;
        else if ((matrikelStr.charAt(0) == '5' && (matrikelStr.charAt(1) == '1' || matrikelStr.charAt(1) == '0') ) ||  matrikelStr.charAt(0) == '6' && matrikelStr.charAt(1) == '1') {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n --------------Matrikelnummer Checker--------------\n\n");
        System.out.print("Geben Sie die Matrikelnummer ein: ");
        int matrik = sc.nextInt();
        //String newMatrikel = String.valueOf(matrik);

        if (!checkMatrikel(matrik)) {
            System.out.println("Matrikelnummer ist nicht gültig!");
        } else System.out.println("Matrikelnummer ist gültig!");

    }
}
