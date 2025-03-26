import java.time.LocalTime;

public class UhrZeit {
    public static void main(String[] args) {

        int stunden = LocalTime.now().getHour();
        int minuten = LocalTime.now().getMinute();
        int sekunden = LocalTime.now().getSecond();

        int sekMitter = stunden * 3600 + minuten * 60 + sekunden;
        int sektag = (23 - stunden) * 3600 + (59 - minuten) * 60 + (60 - sekunden);
        double rest = (double)sekMitter/86400;

        System.out.println("\ndie Anzahl der Sekunden seit Mitternacht: "+ sekMitter);
        System.out.println("die Anzahl der verbleibenden Sekunden für diesen Tag: " + sektag);
        System.out.println("Prozent des Tages schon vergangen: " + rest * 100 + "%");
    }
}
