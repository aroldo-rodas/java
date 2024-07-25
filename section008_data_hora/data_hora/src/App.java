import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;;

public class App {
    public static void main(String[] args) {

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

        
        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println(data07);
    }
}
