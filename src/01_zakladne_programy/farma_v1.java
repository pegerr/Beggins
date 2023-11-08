/*Napíšte program v jazyku Java, ktorý bude generovať náhodné údaje o úrode na farme. Program by mal generovať nasledujúce údaje:
        Počet plodín: od 1 do 100
        Typ plodiny: ovocie, zelenina alebo obilnina
        Úroda na jednu plodinu: od 0 do 100 kg

        Očakávaný výstup:
        Počet plodín: 50
        Typ plodiny: ovocie
        Úroda na jednu plodinu: 75.50 kg

        Možné pod úlohy a rozšírenia:
        Program by sa dal rozšíriť o nasledujúce funkcie:
        Možnosti generovania: Program by mohol ponúkať možnosti na výber typu plodiny a rozsahu úrody.
        Správa chýb: Program by mal byť vybavený mechanizmom na správu chýb, napríklad ak sa vygeneruje počet plodín mimo rozsahu.
        Grafické rozhranie: Program by mohol byť vybavený grafický rozhraním, ktoré by uľahčilo používanie.*/

import java.util.Random;

public class farma_v1 {

    public static void main(String[] args) {
        Random rand = new Random();

        int pocetPlodin = rand.nextInt(100) + 1;

        int typPlodiny = rand.nextInt(3);
        String[] typyPlodin = {"ovocie", "zelenina", "obilnina"};

        double urodaNaPlodinu = rand.nextDouble() * 100;

        System.out.println("Počet plodín: " + pocetPlodin);
        System.out.println("Typ plodiny: " + typyPlodin[typPlodiny]);
        System.out.printf("Úroda na jednu plodinu: %.2f kg%n", urodaNaPlodinu);
    }
}
