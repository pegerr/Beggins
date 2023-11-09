/*Napíšte metódu na zobrazenie stredného znaku reťazca.
Poznámka:
a) Ak je dĺžka reťazca nepárna, bude tam jeden stredný znak.
b) Ak je dĺžka reťazca párna, budú tam dva stredné znaky.
Testovacie údaje:
Zadajte reťazec: 350
Očakávaný výstup:
Stredný znak v reťazci: 5*/


package metody_04;

import java.util.Scanner;

public class metody3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.nextLine();

        String strednyZnak = najdiStrednyZnak(retazec);

        System.out.println("Stredný znak v reťazci: " + strednyZnak);
    }

    public static String najdiStrednyZnak(String retazec) {
        int dlzka = retazec.length();
        int strednyIndex = dlzka / 2;

        if (dlzka % 2 == 0) {
            return retazec.substring(strednyIndex - 1, strednyIndex + 1);
        } else {
            return retazec.substring(strednyIndex, strednyIndex + 1);
        }
    }
}

