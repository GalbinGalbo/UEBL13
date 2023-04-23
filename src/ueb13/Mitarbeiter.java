package ueb13;

/**
 * Beschreiben Sie hier die Klasse ueb13.Mitarbeiter.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mitarbeiter extends Person {
    private String email;
    private Reservierung[] alleReservierungen;
    private int anzahlReservierungen;
    private Mitarbeiter mitarbeiter;

    public Mitarbeiter(String vorname, String nachname, String email){
        super(vorname, nachname);

        alleReservierungen = new Reservierung[10];
        this.email = email;
    }

    public void reserviere(Raum raum, Uhrzeit beginn, Uhrzeit ende, String bemerkung){
        if(mitarbeiter == null){
            throw new IllegalArgumentException("ueb13.Mitarbeiter erstellen");
        }
        if(raum == null){
            throw new IllegalArgumentException("Bitte ueb13.Raum erstellen");
        }

        Reservierung reservierung = new Reservierung(beginn, ende);
        reservierung.setRaum(raum);
        reservierung.setBemerkung(bemerkung);
    }

    public String toString(){
        return super.toString() + " (" + email + ")";
    }

}
