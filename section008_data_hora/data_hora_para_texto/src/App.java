
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.parse("2022-07-29");
        LocalDateTime data02 = LocalDateTime.parse("2022-07-29T01:30:26");
        Instant data03 = Instant.parse("2022-07-26T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Usando o instant
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println(data01.format(fmt1));
        System.out.println(fmt1.format(data01));
        System.out.println(data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(data02.format(fmt2));
        System.out.println(fmt3.format(data03));
    }
}
