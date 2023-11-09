/*Napíšte metódu na výpočet priemeru troch čísel.
Údaje testu:
Zadajte prvé číslo: 25
Zadajte druhé číslo: 45
Zadajte tretie číslo: 65
Očakávaný výstup:
Priemerná hodnota je 45.0*/

        package metody_04;

import java.util.Scanner;

public class metody2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte prvé číslo: ");
        double prveCislo = scanner.nextDouble();

        System.out.print("Zadajte druhé číslo: ");
        double druheCislo = scanner.nextDouble();

        System.out.print("Zadajte tretie číslo: ");
        double tretieCislo = scanner.nextDouble();

        double priemer = vypocitajPriemer(prveCislo, druheCislo, tretieCislo);

        System.out.println("Priemerná hodnota je " + priemer + ".");
    }

    public static double vypocitajPriemer(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

