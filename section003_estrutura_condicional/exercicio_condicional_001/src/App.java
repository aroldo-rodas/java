//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");
        numero = sc.nextInt();
        sc.close();

        System.out.println((numero < 0)?"Número negativo!":"Número positivo!");
    }
}
