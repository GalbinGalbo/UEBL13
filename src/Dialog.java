import java.util.Scanner;
/**
 * Beschreiben Sie hier die Klasse Dialog.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Dialog {

    private Scanner scanner;
    private AlleMitarbeiter alleMitarbeiter;
    private AlleRaeume alleRaeume;

    public Dialog(){
        scanner = new Scanner(System.in);
    }

    public void mitarbeiterErstellen(){
        if(alleMitarbeiter == null){
            alleMitarbeiter = new AlleMitarbeiter();
        }
        System.out.println("Vorname eingeben");
        String vorname = scanner.nextLine();
        System.out.println("Nachname eingeben");
        String nachname = scanner.nextLine();
        System.out.println("Email eingeben");
        String email = scanner.nextLine();

        Mitarbeiter mitarbeiter = new Mitarbeiter(vorname, nachname, email);
        System.out.println("Mitarbeiter " + mitarbeiter + " wurde erstellt");
        alleMitarbeiter.mitarbeiterAnlegen(mitarbeiter);
    }

    public void raumErstellen(){
        alleRaeume = new AlleRaeume();
        System.out.println("Gebäude eingeben:");
        int geb = scanner.nextInt();
        System.out.println("Etage eingeben:");
        int etage = scanner.nextInt();
        System.out.println("Raum eingeben:");
        int raumNr = scanner.nextInt();

        Raum raum = new Raum(geb, etage, raumNr);
        alleRaeume.raumAnlegen(raum);
    }

    public void reserviere(){
        if(alleMitarbeiter.getAnzahlMitarbeiter() == 0){
            throw new IllegalArgumentException("Mitarbeiter erstellen");
        }
        if(alleRaeume.getAnzahlRaeume() == 0){
            throw new IllegalArgumentException("Raum erstellen");
        }

        System.out.println("In welchem Raum soll der Mitarbeiter die Reservierung buchen");
        Raum raum = raumAuswaehlen();

        System.out.println("(Von Uhrzeit) Stunde eingeben");
        int stundeVon = scanner.nextInt();
        System.out.println("Minute eingeben:");
        int minuteVon = scanner.nextInt();
        Uhrzeit uhrzeitVon = new Uhrzeit(stundeVon, minuteVon);

        System.out.println("(Bis Uhrzeit) Stunde eingeben");
        int stundeBis = scanner.nextInt();
        System.out.println("Minute eingeben:");
        int minuteBis = scanner.nextInt();
        Uhrzeit uhrzeitBis = new Uhrzeit(stundeBis, minuteBis);
        scanner.nextLine();
        System.out.println("Bemerkung eingeben:");
        String bemerkung = scanner.nextLine();

        System.out.println("Welcher Mitarbeiter soll die Reservierung buchen(Nachname eingeben)");
        String nachname = scanner.nextLine();
        Mitarbeiter mitarbeiter = alleMitarbeiter.findMitarbeiter(nachname);

        Reservierung reservierung = new Reservierung(uhrzeitVon, uhrzeitBis);
        reservierung.setBemerkung(bemerkung);
        reservierung.setMitarbeiter(mitarbeiter);
        reservierung.setRaum(raum);
        raum.addReservierung(reservierung);
        System.out.println("Raum " + raum + " wurde von " + mitarbeiter + " von " + uhrzeitVon + " bis " + uhrzeitBis + " gebucht");
    }

    public void mitarbeiterAusgeben(){
        System.out.println(alleMitarbeiter.toString());
    }

    public void raeumeAusgeben(){
        System.out.println(alleRaeume.toString());
    }

    public Raum raumAuswaehlen(){
        System.out.println("Gebäude eingeben:");
        int geb = scanner.nextInt();
        System.out.println("Etage eingeben:");
        int etage = scanner.nextInt();
        System.out.println("Raum eingeben:");
        int raumNr = scanner.nextInt();

        Raum raum = alleRaeume.findRaum(geb,etage,raumNr);
        return raum;
    }

    public int einlesenFunktion(){
        int funktion = scanner.nextInt();
        scanner.nextLine();
        return funktion;
    }

    public void menueAusgeben(){
        System.out.println("1: Mitarbeiter erstellen+\n" +
                "2: Raum erstellen\n"+
                "3: Reserviere Raum\n"+
                "4: Mitarbeiter ausgeben\n"+
                "5: Raum mit Reservierungen ausgeben\n");
    }

    public void ausfuehrenFunktion(int funktion){
        if(funktion == 1){
            mitarbeiterErstellen();
        }else if(funktion == 2){
            raumErstellen();
        }else if(funktion == 3){
            reserviere();
        }else if(funktion == 4){
            mitarbeiterAusgeben();
        }else if(funktion == 5){
            raeumeAusgeben();
        }
    }

    public void start(){
        int funktion = -1;
        while(funktion != 0){
            menueAusgeben();
            funktion = einlesenFunktion();
            ausfuehrenFunktion(funktion);
        }
    }

    public static void main(String[] args){
        new Dialog().start();
    }

}
