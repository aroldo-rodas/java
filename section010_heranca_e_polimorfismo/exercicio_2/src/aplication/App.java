package aplication;

import java.util.Scanner;

import entities.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Pagadores de imposto: ");
        int pagadoresImposto = sc.nextInt();

        for(int i = 1; i <= pagadoresImposto; i++) {
            sc.nextLine();
            System.out.println("Pagador de imposto #" + i + ":");
            System.out.print("Pessoa física ou jurídica? (f/j): ");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();

            if(opcao == 'f') {
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();

                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroFuncionarios = sc.nextInt();

                lista.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        sc.close();

        for(Pessoa p : lista) {
            System.out.println(p);
        }
    }
}
