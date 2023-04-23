package ueb13;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann", "max@htwsaar.de");

        //Input "Vorname" and "Nachname" and "Email" and press Alt+Enter to create a new variable
        //script to create a input dialog

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code
            System.out.println(m1);
        System.out.println("Hello World!");
        }
    }
