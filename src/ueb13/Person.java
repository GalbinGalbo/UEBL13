package ueb13;

/**
 * Beschreiben Sie hier die Klasse ueb13.Person.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String toString() {
        return String.format("%s %s", vorname, nachname);
    }

    public String getNachname(){
        return nachname;
    }

}
