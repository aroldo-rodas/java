/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quantidade, soma = 0;
        int[] vetor;
        double media;

        System.out.print("Informe a quantidade de números: ");
        quantidade = sc.nextInt();

        vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o número: ");
            vetor[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }

        media = (double) soma / vetor.length;

        System.out.println("\nSoma = " + soma + "\nMédia = " + media);
    }
}
