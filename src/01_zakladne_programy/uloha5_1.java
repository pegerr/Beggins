/*Napíšte Java program, ktorý použije dve čísla ako vstup a zobrazí súčin dvoch čísel*/

import java.util.Scanner;

public class uloha5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte prvé číslo: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Zadajte druhé číslo: ");
        int secondNumber = scanner.nextInt();

        int product = firstNumber * secondNumber;

        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
    }
}
