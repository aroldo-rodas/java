/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel" */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade;
        double a, b;

        System.out.print("Informe a quantidade de pares: ");
        quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Informe a quantidade os pares: ");
            a = sc.nextDouble();
            b = sc.nextDouble();

            if(b == 0) {
                System.out.println("Operação impossível!");
            }
            else {
                System.out.println(a / b);
            }
        }
        sc.close();
    }
}
