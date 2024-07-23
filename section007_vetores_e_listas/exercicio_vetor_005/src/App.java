/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, maiorValor, posicaoMaiorValor = 0;
        int[] vetor;

        System.out.print("Informe o tamanho do vetor: ");
        quantidade = sc.nextInt();

        vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número: ");
            int numero = sc.nextInt();
            vetor[i] = numero;
        }

        sc.close();

        maiorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++) {
            if (maiorValor < vetor[i]) {
                maiorValor  = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Posição: " + posicaoMaiorValor);
    }
}
