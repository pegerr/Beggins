/*Napíšte Java program, ktorý použije tri čísla ako vstup na výpočet a výpis
priemeru čísel.*/


import java.util.Scanner;
public class uloha12_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cislo1 = scanner.nextInt();
        int cislo2 = scanner.nextInt();
        int cislo3 = scanner.nextInt();

        System.out.println((cislo1+cislo2+cislo3)/3);
    }
}