package aplication;

import java.util.Scanner;
import entities.Inquilino;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeQuartos;
        Inquilino[] quartos = new Inquilino[10];

        System.out.print("Informe a quantidade de quartos a serem alugados: ");
        quantidadeQuartos = sc.nextInt();
        
        //Instancia os objetos se os quartos não tiverem ocupados
        for(int i = 0; i < quantidadeQuartos; i++) {
            sc.nextLine();
            System.out.println("\nAluguel " + (i + 1) +":");
            System.out.print("Informe o nome do inquilino: ");
            String nomeInquilino = sc.nextLine();
            System.out.print("Informe o email do inquilino: ");
            String emailInquilino = sc.nextLine();
            System.out.print("Informe o quarto: ");
            int numeroQuarto = sc.nextInt();

            if(quartos[numeroQuarto] != null) {
                System.out.println("Quarto ocupado!");
            }
            else {
                quartos[numeroQuarto] = new Inquilino(nomeInquilino, emailInquilino, numeroQuarto);
            }
        }

        sc.close();
        System.out.println();

        for(int i = 0; i < quartos.length; i++) {
           if(quartos[i] != null) {
                System.out.println(quartos[i]);
           }
        }
    }
}
