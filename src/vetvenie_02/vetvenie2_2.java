/*Napíšte program na riešenie kvadratických rovníc (použite if, else if a else).
• ak D > 0, tak daná kvadratická rovnica má 2 rôzne reálne korene
• ak D = 0, tak daná kvadratická rovnica má dva rovnaké reálne korene,
čiže tzv. dvojnásobný reálny koreň
• ak D < 0, tak daná kvadratická rovnica nemá riešenie v obore reálnych
čísel (samozrejme v obore komplexných čísel má dva imaginárne
komplexne združené korene)
Pomôcka: 𝑥1,2 =
−𝑏±√𝐷
2𝑎
; 𝐷 = 𝑏
2 − 4𝑎𝑐
Vstup testovacích údajov
Vstup a: 1
Vstup b: 5
Vstup c: 1
Očakávaný výstup :
Korene sú -0,20871215252208009 a -4,7912878474779195*/

import java.util.Scanner;

public class vetvenie2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vstup a: ");
        double a = scanner.nextDouble();

        System.out.print("Vstup b: ");
        double b = scanner.nextDouble();

        System.out.print("Vstup c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Korene sú " + x1 + " a " + x2);
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Korene sú " + x1 + " (dvojnásobný reálny koreň)");
        } else {
            System.out.println("Kvadratická rovnica nemá riešenie v obore reálnych čísel.");
        }

        scanner.close();
    }
}

