package aplication;

import entities.ContaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        //Atributos
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ContaBancaria cliente;
        int numeroConta;
        char opcao;
        String nomeCliente;
        double valor;

        System.out.print("Informe o número da conta: ");
        numeroConta = sc.nextInt();

        //Limpar o buffer
        sc.nextLine();

        System.out.print("Informe o nome do proprietário: ");
        nomeCliente = sc.nextLine();

        System.out.print("Deseja realizar depósito? [s/n]:" );
        opcao = sc.next().charAt(0);

        //Instancia o objeto de acordo com a opção
        if(opcao == 's') {
            System.out.print("Valor inicial de depósito: ");
            valor = sc.nextDouble();
            cliente = new ContaBancaria(numeroConta, nomeCliente, valor);
        }
        else {
            cliente = new ContaBancaria(numeroConta, nomeCliente);
        }
        
        System.out.println(cliente.toString());

        //Depósito
        System.out.print("\nInforme o valor à depositar: ");
        valor = sc.nextDouble();
        cliente.realizarDeposito(valor);
        System.out.println("Valor atualizado:" + cliente.toString());

        //Saque
        System.out.print("\nInforme o valor à sacar: ");
        valor = sc.nextDouble();
        cliente.realizarSaque(valor);
        System.out.println("Valor atualizado:" + cliente.toString());
        
        sc.close();
    }
}
