/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma = 0;

        System.out.print("Informe o número: ");
        n = sc.nextInt();

        if(n == 0) {
            soma = 1;
        }
        else {
            soma = n;
            for(int i = (n - 1); i > 0; i--) {
                soma *= i;
            }
        }
        System.out.println("O fatorial é " + soma);

        sc.close();
    }
}
