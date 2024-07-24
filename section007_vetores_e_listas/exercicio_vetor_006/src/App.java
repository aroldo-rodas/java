/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] A, B, C;
        int tamanho;

        System.out.print("Informe o tamanho do vetor: ");
        tamanho = sc.nextInt();

        A = new int[tamanho];
        B = new int[tamanho];
        C = new int[tamanho];

        for(int i = 0; i < tamanho; i++) {
            System.out.print("Elentos do vetor A:");
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < tamanho; i++) {
            System.out.print("Elentos do vetor B:");
            B[i] = sc.nextInt();
        }

        sc.close();

        for(int i = 0; i < tamanho; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }
    }
}
