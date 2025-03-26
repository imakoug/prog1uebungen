import java.io.FileNotFoundException;
import java.util.Scanner;

public class FreierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        double g = 9.80665;
        System.out.print("Geben Sie die Falldauer ein: ");
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            if (i == 1 || i % 6 == 0) {
                double zs = 1.0/2 * g * i;
                System.out.println("Zeit: " + i + " Sekunden: " + "Zurückgelegte Strecke: " + zs + " m");
                Thread.sleep(1000);
            }
        }
    }
}
