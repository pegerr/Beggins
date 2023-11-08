/*. Napíšte Java program na výpočet zadaného vzorca.
Špecifikovaný vzorec:
4,0 * (1 - (1,0/3) + (1,0/5) - (1,0/7) + (1,0/9) - (1,0/11))
Očakávaný výstup
2,9760461760461765*/

public class uloha10_1 {
    public static void main(String[] args) {
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("Výsledok vzorca je: " + result);
    }
}
