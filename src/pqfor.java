import java.util.Scanner;

public class pqfor {
    public static void errorMessage() {
        System.out.println("Geben Sie nur positive zahl");
    }
    public static void main(String[] args) {

        double p = 2.5;

        if (p < 0) {
            errorMessage();
            return;
        }
        double q = 1.3;

        if (q < 0) {
            errorMessage();
            return;
        }

        double x1 = (-p / 2) + Math.sqrt(Math.pow((p/2), 2) - q);
        double x2 = (-p / 2) - Math.sqrt(Math.pow((p/2), 2) - q);

        System.out.println("x1 :" + x1 );
        System.out.println("x2 :" + x2 + '\n');
        System.out.println("Lösungsmenge: { " + x1 + " , " + x2 + " }");
    }
}
