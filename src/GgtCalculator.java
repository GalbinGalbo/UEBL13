import java.util.Scanner;

public class GgtCalculator {
    public static int berechneGgt(int a, int b) {
        if (b == 0) {
            return a; // ggT(a, 0) = a
        } else {
            return berechneGgt(b, a % b); // ggT(a, b) = ggT(b, a mod b)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();
        scanner.close();
        int ggt = berechneGgt(zahl1, zahl2);
        System.out.println("Der größte gemeinsame Teiler von " + zahl1 + " und " + zahl2 + " ist: " + ggt);
    }
}