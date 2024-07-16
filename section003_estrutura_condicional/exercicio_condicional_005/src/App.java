/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar. */

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade, codigo;

        Locale.setDefault(Locale.US);

        System.out.println("Código  Produto            Preço ");
        System.out.println("1       Cachorro quente    R$ 4.00");
        System.out.println("2       X-Salada           R$ 4.50");
        System.out.println("3       X-Bacon            R$ 5.00");
        System.out.println("4       Torrada simples    R$ 2.00");
        System.out.println("5       Refrigerante       R$ 1.50");
        System.out.print("Informe o código e a quantidade: ");

        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        sc.close();

        switch (codigo) {
            case 1:
                System.out.println("O valor a ser pago é de R$" + quantidade * 4.0);
                break;
            case 2:
            System.out.println("O valor a ser pago é de R$" + quantidade * 4.50);
                break;
            case 3:
            System.out.println("O valor a ser pago é de R$" + quantidade * 5.0);
                break;
            case 4:
            System.out.println("O valor a ser pago é de R$" + quantidade * 2.0);
                break;
            case 5:
            System.out.println("O valor a ser pago é de R$" + quantidade * 1.50);
                break;
            default:
                System.out.println("Produto não está registrado!");
        }
    }
}
