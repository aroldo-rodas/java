/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto, alcool = 0, gasolina = 0, diesel = 0;

        System.out.print("Informe o produto: ");
        produto = sc.nextInt();

        while(produto != 4) {
            if(produto == 1) {
                alcool += 1;
            }
            else if(produto == 2) {
                gasolina += 1;
            }
            else if(produto == 3) {
                diesel += 1;
            }

            System.out.print("Informe o produto: ");
            produto = sc.nextInt();
        }
        sc.close();

        System.out.println("\nMuito obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
