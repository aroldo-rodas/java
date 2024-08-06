import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;
import model.entities.exceptions.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Check in: ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Check Out: ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.print("Reservation: " + reservation);

            System.out.println();
            System.out.print("Update data check in: ");
            checkIn = LocalDate.parse(sc.nextLine(), fmt);
            System.out.println("Update data checkOut: ");
            checkOut = LocalDate.parse(sc.nextLine(), fmt);

            reservation.update(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch(DomainException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }

        catch(RuntimeException e) {
            System.out.println("Erro inesperado!");
            System.out.println(e.getStackTrace());
        }
        sc.close();
    }
}
