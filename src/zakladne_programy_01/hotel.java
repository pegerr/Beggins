/*Napíšte program v jazyku Java, ktorý bude simulovať rezerváciu izby v hoteli. Program by mal spĺňať nasledujúce požiadavky:
Užívateľ by mal byť schopný zadať údaje o rezervácii, vrátane typu izby (jednolôžková, dvojlôžková, apartmán), počtu izieb, dátumu príchodu a odchodu a počtu osôb.
Program by mal vypočítať celkovú cenu rezervácie.
Program by mal vypísať potvrdenie rezervácie.

Výstup:
Typ izby: jednolôžková
Počet izieb: 1
Dátum príchodu: 2023-10-12
Dátum odchodu: 2023-10-14
Počet osôb: 1
Celková cena: 150*/

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte typ izby: ");
        String roomType = scanner.nextLine();

        System.out.println("Zadajte počet izieb: ");
        int numberOfRooms = scanner.nextInt();

        System.out.println("Zadajte dátum príchodu (yyyy-MM-dd): ");
        String arrivalDateInput = scanner.next();
        LocalDate arrivalDate = LocalDate.parse(arrivalDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Zadajte dátum odchodu (yyyy-MM-dd): ");
        String departureDateInput = scanner.next();
        LocalDate departureDate = LocalDate.parse(departureDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Zadajte počet osôb: ");
        int numberOfPersons = scanner.nextInt();

        int pricePerNight = 75;
        int totalDays = (int) arrivalDate.until(departureDate).getDays();
        int totalPrice = pricePerNight * totalDays * numberOfRooms;

        System.out.println("Typ izby: " + roomType);
        System.out.println("Počet izieb: " + numberOfRooms);
        System.out.println("Dátum príchodu: " + arrivalDate);
        System.out.println("Dátum odchodu: " + departureDate);
        System.out.println("Počet osôb: " + numberOfPersons);
        System.out.println("Celková cena: " + totalPrice);

        scanner.close();
    }
}
