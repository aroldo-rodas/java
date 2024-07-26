import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;;

public class App {
    public static void main(String[] args) {

        //Para formatar para um padrão tem que instanciar o DataTimeFormarter
        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Instanciar uma data
        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();

        //Texto para data
        LocalDate data04 = LocalDate.parse("2024-07-25");
        LocalDateTime data05 = LocalDateTime.parse("2024-07-25T13:49:45");
        Instant data06 = Instant.parse("2024-07-25T13:49:45Z");
        Instant data07 = Instant.parse("2024-07-25T13:49:45-03:00");

        //Texto no formato customizado para virar Data-hora
        LocalDate data08 = LocalDate.parse("27/07/2024", ftm1);
        LocalDateTime data09 = LocalDateTime.parse("27/07/2024 10:20", fmt2);
        
        //Criando data a partir de atriubtos isolados
        LocalDate data10 = LocalDate.of(2024, 7, 26);
        LocalDateTime data11 = LocalDateTime.of(2024, 7, 26, 10, 26, 0);

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println(data10);
        System.out.println(data11);
    }
}
