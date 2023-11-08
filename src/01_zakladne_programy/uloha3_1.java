/*Napíšte program Java na delenie čísla a vypísanie na obrazovku. Vytvorte
variantu s načítaním údajov od užívateľa a variantu s pevne zadanými
vstupmi.*/

public class uloha3_1 {
    public static void main(String[] args) {
        double cislo = 50;
        double delitel = 3;

        if (delitel != 0) {
            double vysledok = cislo / delitel;
            System.out.println("Výsledok delenia je: " + vysledok);
        } else {
            System.out.println("Deliteľ nesmie byť nulový.");
        }
    }
}
