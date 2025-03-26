public class Tausch {
    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println("x wert:" + x);
        System.out.println("y wert:" + y);
        //Tausch
        int temp = x;
        x = y;
        y = temp;

        //Nach dem Tausch
        System.out.println("\nx wert:" + x);
        System.out.println("y wert:" + y);
    }
}