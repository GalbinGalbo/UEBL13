package ueb13;

/**
 * Beschreiben Sie hier die Klasse ueb13.Reservierung.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Reservierung {
    private String bemerkung;
    private Uhrzeit beginn;
    private Uhrzeit ende;
    private Mitarbeiter mitarbeiter;
    private Raum raum;

    public Reservierung(Uhrzeit beginn, Uhrzeit ende){
        this.beginn = beginn;
        this.ende = ende;
    }

    public void setBemerkung(String bemerkung){
        this.bemerkung = bemerkung;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter){
        this.mitarbeiter = mitarbeiter;
    }

    public void setRaum(Raum raum){
        this.raum = raum;
    }

    public String toString(){
        return "\ngebucht von " + mitarbeiter + " von " + beginn + " bis " + ende + " fuer " + bemerkung;
    }
}
