/*Napíšte Java program, ktorý vypíše súčet (sčítanie), násobenie, odčítanie,
delenie a zvyšok dvoch čísel.
Údaje testu:
Zadajte prvé číslo: 125
Zadajte druhé číslo: 24
Očakávaný výstup :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/


import java.util.Scanner;
public class uloha6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte prvé číslo: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Zadajte druhé číslo: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        int remainder = firstNumber % secondNumber;
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);

        scanner.close();
    }
}
