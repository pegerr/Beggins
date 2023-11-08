/*Napíšte Java program, ktorý vezme číslo ako vstup a vypíše svoju tabuľku
násobenia až do 10.
Testovacie údaje:
Zadajte číslo: 8
Očakávaný výstup :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24*/


import java.util.Scanner;
public class uloha7_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj cislo: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + " = " + number*i);
        }
    }
}
