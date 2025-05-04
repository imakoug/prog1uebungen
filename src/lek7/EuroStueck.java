package lek7;

public class EuroStueck {

    public static void main(String[] args) {
        int durchlaeufe = 10000;
        int erfolge = 0;
        int faelleMitEuro = 0;

        for (int i = 0; i < durchlaeufe; i++) {
            if (Math.random() < 0.5) {
                // Es ist ein Euro im Schreibtisch
                faelleMitEuro++;

                // Wähle zufällig eines der 3 Fächer (0, 1, 2)
                int fach = (int)(Math.random() * 3);

                // Wenn er im Fach 3 liegt (Index 2)
                if (fach == 2) {
                    erfolge++;
                }
            }
        }

        // Wahrscheinlichkeit, dass Euro im dritten Fach liegt, wenn er da ist
        double wahrscheinlichkeit = (double) erfolge / faelleMitEuro;
        System.out.println("Geschätzte Wahrscheinlichkeit: " + wahrscheinlichkeit);
    }

}
