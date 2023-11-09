/*Napíšte Java program na výpočet a výpis plochy a obvodu kruhu.
Testovacie údaje:
Polomer = 7,5
Očakávaný výstupný
obvod je = 47,12388980384689
Oblasť je = 176,71458676442586*/


public class uloha11_1 {
    public static void main(String[] args) {
        // Definícia polomeru
        double radius = 7.5;

        // Výpočet obvodu
        double circumference = 2 * Math.PI * radius;
        System.out.println("Obvod je = " + circumference);

        // Výpočet plochy
        double area = Math.PI * radius * radius;
        System.out.println("Oblasť je = " + area);
    }
}

