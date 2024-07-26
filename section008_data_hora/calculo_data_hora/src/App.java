import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        LocalDate data01 = LocalDate.parse("2022-07-20");
        LocalDateTime data02 = LocalDateTime.parse("2022-07-29T01:30:26");
        Instant data03 = Instant.parse("2022-07-26T01:30:26Z");

        //Instanciar uma data uma semana atrás
        LocalDate semanaPassadaLocalDate = data01.minusDays(7);
        LocalDate proximaSemanaLocalDate = data01.plusDays(7);

        Instant semanaPassadaInstant = data03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = data03.plus(7, ChronoUnit.DAYS);

        System.out.println(semanaPassadaLocalDate);
        System.out.println(proximaSemanaLocalDate);

        System.out.println(semanaPassadaInstant);
        System.out.println(proximaSemanaInstant);

        //Tempo entre duas datas
        Duration t1 = Duration.between(semanaPassadaInstant, proximaSemanaInstant);

        System.out.println(t1.toDays());
    }
}
