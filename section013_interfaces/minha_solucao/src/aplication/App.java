package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.entities.Carro;
import model.services.AlugarService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("ALUGA CARROS");
        System.out.print("Modelo:");
        Carro carro = new Carro(sc.nextLine());
        System.out.print("Retirada: ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Entrega: ");
        LocalDateTime fim = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Preço hora: ");
        double precoHora = sc.nextDouble();
        System.out.print("Preço dia: ");
        double precoDia = sc.nextDouble();
        
        sc.close();
        
        AlugarService cliente = new AlugarService(inicio, fim, precoHora, precoDia, carro);
        System.out.println(cliente);
    }
}
