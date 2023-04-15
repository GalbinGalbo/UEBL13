/**
 * Beschreiben Sie hier die Klasse Uhrzeit.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Uhrzeit
{
    private int stunde;
    private int minute;

    public Uhrzeit(int stunde, int minute)
    {
        this.stunde= stunde;
        this.minute=minute;

    }

    public void setStunde(int stunde) {
        this.stunde = stunde;
    }

    public int getStunde(int stunde) {
        return this.stunde;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute(int minute) {
        return this.minute;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     *
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y
     */
    public String toString()
    {
        return String.format("%d:%d Uhr", this.stunde, this.minute) ;
    }
}
