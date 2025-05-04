package lek7;

public class BSpiel {

    public static String spiel(String wort) {
        String bwort = "";
        char[] vokale = {'a','e','i','o','u'};
        for (int i = 0; i < wort.length(); i++) {
            for (int j = 0; j < vokale.length; j++) {
                if (wort.charAt(i) == vokale[j]) bwort += wort.charAt(i) + "b";
            }
            bwort += wort.charAt(i);
        }
        return bwort;
    }
    public static void main(String[] args) {

        System.out.println(spiel("spiel ") + spiel("mit ") + spiel("mir"));
    }
}
