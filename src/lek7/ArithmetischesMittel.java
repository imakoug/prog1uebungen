package lek7;
import java.util.Scanner;
import lek5.potenz;

public class ArithmetischesMittel {

    public static double min(double[] arr) {
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static double max(double[] arr) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static double mittelwert(double[] arr) {
        double summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe += arr[i];
        }
        return summe/arr.length;
    }

    public static double abweichung(double[] arr) {
        double summe = 0;
        double mittelwert = mittelwert(arr);
        for (int i = 0; i < arr.length; i++) {
            summe += potenz.power(arr[i] - mittelwert, 2);
        }
        return Math.sqrt(summe/arr.length);
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl der einzulesenden Werte: ");
        int anzahl = sc.nextInt();
        if (anzahl < 0) throw new Exception("Die Anzahl der Werte soll groesser als 0 sein!");
        double[] arr = new double[anzahl];
        for (int i = 1; i <= anzahl; i++) {
            System.out.print(i+ ". Wert: ");
            double wert = sc.nextDouble();
            arr[i-1] = wert;
        }
        System.out.println("Kleinster Wert: " + min(arr));
        System.out.println("Groesster Wert: " + max(arr));
        System.out.println("Arithmetischer Mittelwert: " + mittelwert(arr));
        System.out.println("Standardabweichung: " + abweichung(arr));

    }
}
