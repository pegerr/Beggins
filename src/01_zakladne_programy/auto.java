/*Napíšte program v jazyku Java, ktorý bude simulovať jazdu automobilu. Program by mal spĺňať nasledujúce požiadavky:
Vstupné údaje (zadá užívateľ):
Značka automobilu: Škoda
Model automobilu: Oktávia
Spotreba litrov na 100 km: 6
Objem nádrže (litre): 40
Vzdialenosť cesty: 1000

Očakávaný výstup:
Značka automobilu: Škoda
Model automobilu: Oktávia
Spotreba: 6l/100 km
Objem nádrže: 40 litrov
Vzdialenosť cesty: 1000 kilometrov
Celková spotreba paliva: 60.0 litrov
Počet natankovaní: 2*/

import java.util.Scanner;

public class auto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vstup údajov od užívateľa
        System.out.println("Značka automobilu: ");
        String brand = scanner.nextLine();

        System.out.println("Model automobilu: ");
        String model = scanner.nextLine();

        System.out.println("Spotreba litrov na 100 km: ");
        double consumption = scanner.nextDouble();

        System.out.println("Objem nádrže (litre): ");
        double tankCapacity = scanner.nextDouble();

        System.out.println("Vzdialenosť cesty (kilometre): ");
        double distance = scanner.nextDouble();

        // Výpočet celkovej spotreby paliva
        double totalConsumption = (distance / 100) * consumption;
        int refills = (int) Math.ceil(totalConsumption / tankCapacity);

        // Výpis výsledkov simulácie
        System.out.println("Značka automobilu: " + brand);
        System.out.println("Model automobilu: " + model);
        System.out.println("Spotreba: " + consumption + "l/100 km");
        System.out.println("Objem nádrže: " + tankCapacity + " litrov");
        System.out.println("Vzdialenosť cesty: " + distance + " kilometrov");
        System.out.println("Celková spotreba paliva: " + totalConsumption + " litrov");
        System.out.println("Počet natankovaní: " + refills);

        scanner.close();
    }
}
