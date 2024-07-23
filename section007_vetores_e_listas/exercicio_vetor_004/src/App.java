/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quantidade, somaPares = 0;
        int[] vetor;


        System.out.print("Quantidade de números a serem lidos: ");
        quantidade = sc.nextInt();

        vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        sc.close();

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                System.out.print(" " + vetor[i]);
                somaPares += 1;
            }
        }

        System.out.println("\nQuantidade de pares: " + somaPares);

    }
}
