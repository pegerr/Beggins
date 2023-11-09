/*Vezmite od používateľa tri čísla a vypíšte najväčšie číslo.
Testovacie údaje
Zadajte 1. číslo: 25
Zadajte 2. číslo: 78
Zadajte 3. číslo: 87
Očakávaný výstup :
Najväčšie číslo: 87*/

import java.util.Scanner;

public class vetvenie3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte 1. číslo: ");
        int cislo1 = scanner.nextInt();

        System.out.print("Zadajte 2. číslo: ");
        int cislo2 = scanner.nextInt();

        System.out.print("Zadajte 3. číslo: ");
        int cislo3 = scanner.nextInt();

        int najvacsieCislo = cislo1;

        if (cislo2 > najvacsieCislo) {
            najvacsieCislo = cislo2;
        }

        if (cislo3 > najvacsieCislo) {
            najvacsieCislo = cislo3;
        }

        System.out.println("Najväčšie číslo: " + najvacsieCislo);

        scanner.close();
    }
}
