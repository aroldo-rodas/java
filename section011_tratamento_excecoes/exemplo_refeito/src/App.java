import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.Exceptions.DatasException;
import model.entities.Reserva;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Informe o número do quarto: ");
            int numeroQuarto = sc.nextInt();

            sc.nextLine();

            System.out.print("Informe a data de check in: ");
            LocalDate checkIn = LocalDate.parse(sc.nextLine(), fmt);

            System.out.print("Informe a data de checkOut: ");
            LocalDate checkOut = LocalDate.parse(sc.nextLine(), fmt);

            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println(reserva);

            System.out.println();
            System.out.println("Informações da atualização:");
            System.out.print("Nova data de checkIn: ");
            checkIn = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Nova data de checkOut: ");
            checkOut = LocalDate.parse(sc.nextLine(), fmt);

            reserva.atualizacaoDatas(checkIn, checkOut);
            System.out.println(reserva);
        }
        catch(DatasException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}
