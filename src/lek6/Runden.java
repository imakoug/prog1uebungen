package lek6;

public class Runden {
    public static int runden (double zahl) {
        int ganz = (int) zahl;
        double r = zahl - ganz;
        if (r >= 0.5) return ganz+1;
        else return ganz;
    }

    public static double nachkommarunden (double zahl, int anz) {
        int f = 1;
        for (int i = 0; i < anz; i++) {
            f *= 10;
        }
        double verschoben = zahl * f;
        int gerundet = runden(verschoben);
        return (double) gerundet / f;
    }
    public static void main (String[] args) {
        System.out.println(nachkommarunden(3.90999999, 2));
        Dreieck dr = new Dreieck();
        dr.dreieck(2);
    }

}
