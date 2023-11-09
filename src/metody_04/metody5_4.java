/*Napíšte metódu na počítanie všetkých slov v reťazci.
Testovacie údaje:
Zadajte reťazec: Kto nevie byť spokojný s málom, nebude spokojný nikdy.
Očakávaný výstup:
Počet slov v reťazci: 9*/

package metody_04;

import java.util.Scanner;

public class metody5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.nextLine();

        int pocetSlov = spocitajSlova(retazec);

        System.out.println("Počet slov v reťazci: " + pocetSlov);
    }

    public static int spocitajSlova(String retazec) {
        // Rozdelíme reťazec podľa medzier a iných bielych znakov, aby sme získali slová
        String[] slova = retazec.split("\\s+");

        return slova.length;
    }
}
