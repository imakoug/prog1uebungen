import java.time.LocalTime;

public class UhrZeit {
    public static void main(String[] args) {

        int stunden = LocalTime.now().getHour();
        int minuten = LocalTime.now().getMinute();
        int sekunden = LocalTime.now().getSecond();

        int sekSeitMitter = stunden * 3600 + minuten * 60 + sekunden;
        int sekTag = 86400 - sekSeitMitter;
        double rest = (double)sekSeitMitter/86400;

        System.out.println("\ndie Anzahl der Sekunden seit Mitternacht: "+ sekSeitMitter);
        System.out.println("die Anzahl der verbleibenden Sekunden für diesen Tag: " + sekTag);
        System.out.println("Prozent des Tages schon vergangen: " + rest * 100 + "%");
    }
}
