package ueb13;

/**
 * Beschreiben Sie hier die Klasse ueb13.Raum.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Raum {
    private int geb;
    private int etage;
    private int raum;
    private Reservierung[] alleReservierungen;
    private int anzahlReservierungen;

    public Raum(int geb, int etage, int raum){
        if(anzahlReservierungen == 0){
            alleReservierungen = new Reservierung[10];
        }
        this.geb = geb;
        this.etage = etage;
        this.raum = raum;
    }

    public void addReservierung(Reservierung reservierung){
        alleReservierungen[anzahlReservierungen] = reservierung;
        anzahlReservierungen++;
    }

    public Reservierung getReservierung(int index){
        return alleReservierungen[index];
    }

    public int getGeb(){
        return geb;
    }

    public int getEtage(){
        return etage;
    }

    public int getRaum(){
        return raum;
    }

    public String toString(){
        return geb + "-" +etage + "." +raum;
    }

}
