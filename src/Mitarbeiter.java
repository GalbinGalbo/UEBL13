public class Mitarbeiter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String email;
    private String vorname;
    private String nachname;

    private Reservierung[] reservierungen;
    /**
     * Konstruktor für Objekte der Klasse Mitarbeiter
     */
    public Mitarbeiter(String vorname, String nachname, String email)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email= email;
        this.reservierungen = new Reservierung[0];

    }

    public String toString(){
        return String.format("%s %s (%s)", vorname, nachname, email);
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     *
     * @param y ein Beispielparameter für eine Methode
     * @return die Summe aus x und y

    public void reserviere(Raum raum, Uhrzeit beginn, Uhrzeit ende, String bemerkung)
    {
        Reservierung.reserviere(raum, beginn, ende, bemerkung, this);
    }*/
}