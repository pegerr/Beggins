/*Napíšte metódu na počítanie všetkých samohlások v reťazci.
Testovacie údaje:
Zadajte reťazec: Odvaha
Očakávaný výstup:
Počet samohlások v reťazci: 3*/

package metody_04;

import java.util.Scanner;

public class metody4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.nextLine();

        int pocetSamohlasok = spocitajSamohlasky(retazec);

        System.out.println("Počet samohlások v reťazci: " + pocetSamohlasok);
    }

    public static int spocitajSamohlasky(String retazec) {
        retazec = retazec.toLowerCase();

        int pocetSamohlasok = 0;
        for (int i = 0; i < retazec.length(); i++) {
            char znak = retazec.charAt(i);
            if (znak == 'a' || znak == 'e' || znak == 'i' || znak == 'o' || znak == 'u') {
                pocetSamohlasok++;
            }
        }

        return pocetSamohlasok;
    }
}

