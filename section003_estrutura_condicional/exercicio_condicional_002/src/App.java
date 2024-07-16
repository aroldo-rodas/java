//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        sc.close();

        System.out.println((numero % 2 == 0) ? "Número par!": "Número ímpar!");
    }
}
