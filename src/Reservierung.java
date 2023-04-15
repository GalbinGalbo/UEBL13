public class Reservierung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String bemerkung;
    private Uhrzeit beginn;
    private Uhrzeit ende;
    private Mitarbeiter mitarbeiter;
    private Raum raum ;

    private static Reservierung[] reservierungen = new Reservierung[0];
    public Reservierung(Uhrzeit beginn,Uhrzeit ende)
    {
        this.beginn = beginn;
        this.ende = ende;

    }
    public void setBemerkung(String bemerkung){
        this.bemerkung= bemerkung;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter){
        this.mitarbeiter = mitarbeiter ;
    }

    public void setRaum(Raum raum){
        this.raum= raum;

    }
    public String toString(){
        return String.format("Raum %s /n gebucht von %s von %s bis %s für %s",raum, mitarbeiter,beginn, ende, bemerkung);

    }

}

