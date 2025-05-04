package lek5;

public class reihenwert {
    public static void main(String[] args) {
        double summe = 0.0;
        double aenderung;
        int k = 1;

        do {
            double term = 6.0 / (k * k);
            double neueSumme = summe + term;
            aenderung = neueSumme - summe;
            summe = neueSumme;
            System.out.println("k = "+ k + ", Aenderung = " + aenderung + ", Summe: " + summe);
            k++;
        } while (aenderung > 1e-5);
    }
}
