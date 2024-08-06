import model.entities.Conta;
import model.excpetions.RegrasSaqueException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entre com os dados da conta.\n");
            System.out.print("Número da conta:");
            int numeroConta = sc.nextInt();
            sc.nextLine();
            System.out.print("Proprietário: ");
            String proprietarioConta = sc.nextLine();
            System.out.print("Saldo inicial: ");
            Double saldoConta = sc.nextDouble();
            System.out.print("Saque limite: ");
            Double saqueLimite = sc.nextDouble();

            Conta conta = new Conta(numeroConta, proprietarioConta, saldoConta, saqueLimite);

            System.out.print("Informe o valor do saque: ");
            Double valorSaque = sc.nextDouble();
            conta.saque(valorSaque);
        }
        catch(RegrasSaqueException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro inesperado.");
        }

        sc.close();
    }
}
