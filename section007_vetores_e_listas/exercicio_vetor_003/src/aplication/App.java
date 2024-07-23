/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Pessoa;

public class App {
    public static void main(String[] args) {
        //Atributos
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quantidade, pessoasAdolescentes = 0;
        Pessoa[] vetor;
        double somaAltura = 0;

        System.out.print("Informe a quantidade de pessoas: ");
        quantidade = sc.nextInt();

        vetor = new Pessoa[quantidade];

        //Preenche vetor criandos objetos do tipo Pessoa
        for(int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
        }

        sc.close();

        //Soma altura e pessoas < 16
        for(int i = 0; i < vetor.length; i++) {
            somaAltura += vetor[i].getAltura();

            if(vetor[i].getIdade() < 16) {
                pessoasAdolescentes += 1;
            }
        }

        System.out.println("\nAltura média: " +
            String.format("%.2f", (somaAltura / vetor.length)) +
            "\nPessoas com menos de 16 anos: " +
            String.format("%.2f", ((double)pessoasAdolescentes / vetor.length) * 100.0) + "%");

        //Pessoas menores que 16 anos
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }
    }
}
