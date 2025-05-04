import java.util.Scanner;

public class krEIs {
    public static void main(String[] args) {
        double pi = Math.PI;
        double radius = 5.5;
        System.out.println("Kreisfläche: " + pi * radius * radius);
        System.out.println("Kreisumfang: " + pi * 2 * radius);
        System.out.println("Kugelvolumen: " + ( (double)4/3) * pi * Math.pow(radius, 3));
    }
}
