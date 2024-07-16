/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        boolean multiplo;

        System.out.print("Informe dois números: ");
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        if(A > B) {
            multiplo = (A % B  == 0) ? true : false;

            System.out.println("São multiplos? " + multiplo);
        }
        else {
            multiplo = (B % A == 0) ? true : false;

            System.out.println("São multiplos? " + multiplo);
        }
    }
}
