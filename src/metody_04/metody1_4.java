/* Napíšte metódu na nájdenie najmenšieho čísla medzi tromi číslami.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 37
Zadajte tretie číslo: 29
Očakávaný výstup:
Najmenšia hodnota je 25.0*/


package metody_04;

import java.util.Scanner;

public class metody1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double prveCislo = scanner.nextDouble();

        System.out.print("Zadajte druhé číslo: ");
        double druheCislo = scanner.nextDouble();

        System.out.print("Zadajte tretie číslo: ");
        double tretieCislo = scanner.nextDouble();

        double najmensieCislo = najdiNajmensieCislo(prveCislo, druheCislo, tretieCislo);

        System.out.println("Najmenšia hodnota je " + najmensieCislo + ".");
    }

    public static double najdiNajmensieCislo(double a, double b, double c) {
        double najmensie = a;

        if (b < najmensie) {
            najmensie = b;
        }

        if (c < najmensie) {
            najmensie = c;
        }

        return najmensie;
    }
}
