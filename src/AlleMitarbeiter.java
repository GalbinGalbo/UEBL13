
/**
 * Beschreiben Sie hier die Klasse alleMitarbeiter.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AlleMitarbeiter {
    private Mitarbeiter[] alleMitarbeiter;
    private int anzahlMitarbeiter;

    public AlleMitarbeiter(){
        alleMitarbeiter = new Mitarbeiter[10];
    }

    public void mitarbeiterAnlegen(Mitarbeiter mitarbeiter){
        alleMitarbeiter[anzahlMitarbeiter] = mitarbeiter;
        anzahlMitarbeiter++;
    }

    public Mitarbeiter findMitarbeiter(String nachname){
        int index = checkMitarbeiter(nachname);
        if(index == -1){
            throw new IllegalArgumentException("Mitarbeiter mit dem Nachnamen existiert nicht");
        }
        Mitarbeiter mitarbeiter = alleMitarbeiter[index];
        return mitarbeiter;
    }

    public int checkMitarbeiter(String nachname){
        for(int i = 0; i < anzahlMitarbeiter; i++){
            if(nachname.equals(alleMitarbeiter[i].getNachname())){
                return i;
            }
        }
        return -1;
    }

    public int getAnzahlMitarbeiter(){
        return anzahlMitarbeiter;
    }

    public String toString(){
        String ausgabe = "";
        for(int i = 0; i < anzahlMitarbeiter; i++){
            ausgabe = ausgabe + (i + 1) +": " + alleMitarbeiter[i] + "\n";
        }
        return ausgabe;
    }

}
