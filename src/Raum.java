/**
 * Beschreiben Sie hier die Klasse Raum.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Raum
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int geb;
    private int etage;
    private int raum;

    private int neu;
    private int newww;

    /**hier war ich
     *sdfdf
     */
    private Reservierung[] reservierungen;
    /**
     * Konstruktor für Objekte der Klasse Raum
     */
    public Raum(int geb, int etage, int raum)
    {
        this.geb = geb;
        this.etage= etage;
        this.raum= raum;
    }
    public String toString(){
        return String.format("Raum %d-%d.%d",geb,etage,raum);
    }
    public void addReservierung(Reservierung reservierung){
        this.reservierungen = new Reservierung[0];
    }
    /**
     *angeblich für die Speicherung der Info über die Reservierung

    public void addReservierung(Reservierung reservierung)
    {
// tragen Sie hier den Code ein
        return x + y;
    }*/
}