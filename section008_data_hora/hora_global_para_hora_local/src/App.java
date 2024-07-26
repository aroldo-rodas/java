import java.time.*;

public class App {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.parse("2022-07-29");
        LocalDateTime data02 = LocalDateTime.parse("2022-07-29T01:30:26");
        Instant data03 = Instant.parse("2022-07-26T01:30:26Z");

        //Data-hora global -> Data local
        LocalDate r1 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);

        System.out.println(data01.getDayOfMonth());
        System.out.println(data01.getMonthValue());
        System.out.println(data01.getYear());

    }
}
