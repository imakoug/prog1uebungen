import java.util.Scanner;

public class pqfor {
    public static void errorMessage() {
        System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "Geben Sie nur positive zahl");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie p ein: ");
        double p = sc.nextDouble();
        if (p < 0) {
            errorMessage();
            return;
        }
        System.out.print("Geben Sie q ein: ");
        double q = sc.nextDouble();

        if (q < 0) {
            errorMessage();
            return;
        }

        double x1 = (-p / 2) + Math.sqrt(Math.pow((p/2), 2) - q);
        double x2 = (-p / 2) - Math.sqrt(Math.pow((p/2), 2) - q);

        System.out.println(ConsoleColors.BLUE_BOLD + "x1 :" + x1);
        System.out.println(ConsoleColors.GREEN_BOLD + "x2 :" + x2);
        System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Lösungsmenge: { " + x1 + " , " + x2 + " }");
    }
}
