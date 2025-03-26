import java.util.Scanner;

public class kries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        double radius;
        System.out.printf("Geben Sie den Radius des Kreises ein: ");
        radius = sc.nextDouble();
        System.out.println("Kreisfläche: " + pi * radius * radius);
        System.out.println("Kreisumfang: " + pi * 2 * radius);
        System.out.println("Kreisvoulumen: " + (4/3) * pi * Math.pow(radius, 3));
    }
}
