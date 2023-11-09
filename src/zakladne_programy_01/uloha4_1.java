/*Napíšte program Java, ktorý vypíše výsledok nasledujúcich operácií.
Testovacie údaje:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3*/

public class uloha4_1 {
        public static void main(String[] args) {
            int resultA = -5 + 8 * 6;

            int resultB = (55 + 9) % 9;

            int resultC = 20 + -3 * 5 / 8;

            int resultD = 5 + 15 / 3 * 2 - 8 % 3;

            System.out.println("Výsledok operácie a: " + resultA);
            System.out.println("Výsledok operácie b: " + resultB);
            System.out.println("Výsledok operácie c: " + resultC);
            System.out.println("Výsledok operácie d: " + resultD);

            // Celkový výstup
            int totalResult = resultA + resultB + resultC + resultD;
            System.out.println("Celkový výsledok: " + totalResult);
        }
}
