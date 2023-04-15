
/**
 * Beschreiben Sie hier die Klasse alleRaeume.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AlleRaeume {
    private Raum[] alleRaeume;
    private int anzahlRaeume;

    public AlleRaeume(){
        alleRaeume = new Raum[10];
    }

    public void raumAnlegen(Raum raum){
        alleRaeume[anzahlRaeume] = raum;
        anzahlRaeume++;
        for(int i = 0; i < anzahlRaeume; i++){
            System.out.println(raum);
        }
    }

    public Raum findRaum(int geb, int etage, int raumNr){
        int index = checkRaum(geb, etage, raumNr);
        if(index == -1){
            throw new IllegalArgumentException("Der Raum existiert nicht");
        }
        Raum raum = alleRaeume[index];
        return raum;
    }

    public int checkRaum(int geb, int etage, int raum){
        for(int i = 0; i < anzahlRaeume; i++){
            if(alleRaeume[i].getGeb() == geb && alleRaeume[i].getEtage() == etage && alleRaeume[i].getRaum() == raum){
                return i;
            }
        }
        return -1;
    }


    public int getAnzahlRaeume(){
        return anzahlRaeume;
    }

    public String toString(){
        String ausgabe = "Raum ";
        for(int i = 0; i < anzahlRaeume; i++){
            Raum raum = alleRaeume[i];
            ausgabe = ausgabe + raum + raum.getReservierung(i) +"\n";
        }
        return ausgabe;
    }

}
