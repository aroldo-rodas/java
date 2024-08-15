package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.AluguelService;
import model.services.BrasilTaxa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.print("Modelo do carro: ");
        Veiculo carro = new Veiculo(sc.nextLine());
        System.out.print("Retirada (dd/MM/yyyy): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy): ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);

        AluguelCarro alg = new AluguelCarro(inicio, fim, carro);

        System.out.print("Preço por hora: ");
        Double precoHora = sc.nextDouble();
        System.out.print("Preço dia: ");
        Double precoDia = sc.nextDouble();

        AluguelService aluguelService = new AluguelService(precoHora, precoDia, new BrasilTaxa());

        aluguelService.processarFatura(alg);

        sc.close();
    }
}
