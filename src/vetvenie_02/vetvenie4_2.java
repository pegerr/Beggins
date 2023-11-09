/*Napíšte program, ktorý prečíta číslo s desatinnou čiarkou a vypíše "nula",
ak je číslo nula. V opačnom prípade výpise „pozitívne číslo“ alebo „negatívne
číslo“. Pridajte „malé“, ak je absolútna hodnota čísla menšia ako 1, alebo
„veľké“, ak je väčšia 1 000 000.
Testovacie dáta
Zadajte číslo: 25
Očakávaný výstup :
Vstupná hodnota: 25
Kladné číslo*/


import java.util.Scanner;

public class vetvenie4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte číslo: ");
        double cislo = scanner.nextDouble();

        System.out.println("Vstupná hodnota: " + cislo);

        if (cislo == 0) {
            System.out.println("Nula");
        } else if (cislo > 0) {
            if (Math.abs(cislo) < 1) {
                System.out.println("Pozitívne malé číslo");
            } else if (cislo > 1000000) {
                System.out.println("Pozitívne veľké číslo");
            } else {
                System.out.println("Pozitívne číslo");
            }
        } else {
            if (Math.abs(cislo) < 1) {
                System.out.println("Negatívne malé číslo");
            } else if (Math.abs(cislo) > 1000000) {
                System.out.println("Negatívne veľké číslo");
            } else {
                System.out.println("Negatívne číslo");
            }
        }

        scanner.close();
    }
}
