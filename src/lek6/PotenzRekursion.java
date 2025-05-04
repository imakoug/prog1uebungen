package lek6;

public class PotenzRekursion {

    public static double potenz(double b, int e) {
        if (e == 0) return 1;
        if (e == 1) return b;
        else {
            return b * potenz(b, e - 1); // 3 hoch 3 => 3 * potenz(3, 2) => 3 * (3 * potenz(3,1)) => 3 * 3 * 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(potenz(3,3));
    }
}
