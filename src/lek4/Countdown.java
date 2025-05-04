package lek4;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 15; i >= 0; i--) {
            if (i == 1) System.out.println(i + " Sekunde");
            else System.out.println(i + " Sekunden");
            Thread.sleep(1000);
        }
    }
}
