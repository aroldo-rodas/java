/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;

        System.out.print("Informe a senha: ");
        senha = sc.nextInt();

        while(senha != 2002) {
            System.out.println("Senha inválida!");

            System.out.print("\nInforme a senha: ");
            senha = sc.nextInt();
            sc.close();
        }

        System.out.println("Senha correta!");
    }
}
