/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quantidade;
        int[] vetor;

        System.out.print("Quantidade de números para serem lidos: ");
        quantidade = sc.nextInt();
        vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        sc.close();

        System.out.println("Números negativos: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
    }
}
