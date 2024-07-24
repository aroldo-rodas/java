/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        int tamanho;
        double[] vetor;
        double soma = 0, media;
        
        System.out.print("Informe o tamanho do vetor: ");
        tamanho = sc.nextInt();

        vetor = new double[tamanho];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento do vetor: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        sc.close();
        media = soma/vetor.length;
        System.out.println(String.format("Média: %.3f \n", media));

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < (media)) {
                System.out.println(String.format("%.1f", vetor[i]));
            }
        }
    }
}
