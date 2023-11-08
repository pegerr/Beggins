/*Napíšte Java program, ktorý vypočíta zadané výrazy a vypíše výstup.
Údaje testu:
((25,5 * 3,5 - 3,5 * 3,5) / (40,5 - 4,5))
Očakávaný výstup
2,138888888888889*/

public class uloha9_1 {
    public static void main(String[] args) {
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("Výsledok výrazu je: " + result);
    }
}
