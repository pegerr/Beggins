/*Napíšte program v jazyku Java, ktorý bude simulovať správu národného parku. Program by mal spĺňať nasledujúce požiadavky:
Užívateľ by mal byť schopný zadať údaje o národnom parku, vrátane názvu, rozlohy a počtu návštevníkov za rok.
Program by mal simulovať návštevníkov národného parku, vypočítať a vypísať nasledujúce údaje:
        Celkový počet návštevníkov za rok.
        Počet návštevníkov podľa typu terénu krajiny (hory, údolia).
        Priemerný počet návštevníkov na kilometer štvorcový.


Vstupy:
Názov národného parku: Slovenský Raj
Rozloha národného parku (km2): 1200
Počet návštevníkov za rok: 130000

Očakávaný výstup:
Názov národného parku: Slovenský Raj
Rozloha národného parku: 1200 km2
Počet návštevníkov za rok: 130000
Počet návštevníkov podľa typu krajiny:
  Hory: 97444
  Údolia: 32556
Priemerný počet návštevníkov na kilometer štvorcový: 108.0

Program by sa dal rozšíriť o nasledujúce funkcie:

Možnosti generovania návštevníkov:
Tento doplnok by umožnil programátorovi určiť, akých návštevníkov chce simulovať. Napríklad, programátor by mohol určiť, že chce simulovať iba domácich návštevníkov alebo iba zahraničných návštevníkov. Programátor by tiež mohol určiť, že chce simulovať návštevníkov rôznych vekových kategórií alebo rôznych vzdelávacích úrovní.

Správa návštevnosti:
Tento doplnok by umožnil programátorovi sledovať návštevnosť národného parku podľa ročného obdobia, dňa v týždni, času dňa a konkrétnych lokalít. Tieto informácie by boli užitočné pre správcov národných parkov na plánovanie a manažment návštevnosti.

Analýza návštevnosti:
Tento doplnok by poskytoval analýzu návštevnosti, napríklad o tom, ktoré aktivity sú návštevníkmi najvyhľadávanejšie alebo aké sú ich preferencie pri návšteve národného parku. Tieto informácie by boli užitočné pre správcov národných parkov na pochopenie potrieb a záujmov návštevníkov.*/


import java.util.Scanner;

public class park {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Názov národného parku: ");
        String parkName = scanner.nextLine();

        System.out.println("Rozloha národného parku (km2): ");
        double area = scanner.nextDouble();

        System.out.println("Počet návštevníkov za rok: ");
        int visitors = scanner.nextInt();

        int mountainVisitors = (int) (visitors * 0.75);
        int valleyVisitors = (int) (visitors * 0.25);
        double averageVisitorsPerKm2 = visitors / area;

        System.out.println("Názov národného parku: " + parkName);
        System.out.println("Rozloha národného parku: " + area + " km2");
        System.out.println("Počet návštevníkov za rok: " + visitors);
        System.out.println("Počet návštevníkov podľa typu krajiny:");
        System.out.println("  Hory: " + mountainVisitors);
        System.out.println("  Údolia: " + valleyVisitors);
        System.out.println("Priemerný počet návštevníkov na kilometer štvorcový: " + averageVisitorsPerKm2);

        scanner.close();
    }
}

