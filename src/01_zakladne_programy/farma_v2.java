/*Program by sa dal rozšíriť o funkciu, ktorá by počítala celkovú úrodu na farme. Táto funkcia by sa dala implementovať nasledovne:
Očakávaný výstup:
Počet plodín: 50
Typ plodiny: ovocie
Úroda na jednu plodinu: 75.50 kg
Celková úroda: 3775 kg*/

import java.util.Random;

public class farma_v2 {
    public static void main(String[] args) {
        Random random = new Random();

        int cropCount = random.nextInt(100) + 1;
        String[] cropTypes = {"ovocie", "zelenina", "obilnina"};
        String cropType = cropTypes[random.nextInt(cropTypes.length)];
        double yieldPerCrop = random.nextDouble() * 100;

        System.out.println("Počet plodín: " + cropCount);
        System.out.println("Typ plodiny: " + cropType);
        System.out.printf("Úroda na jednu plodinu: %.2f kg\n", yieldPerCrop);

        double totalYield = cropCount * yieldPerCrop;
        System.out.printf("Celková úroda: %.2f kg\n", totalYield);
    }
}
