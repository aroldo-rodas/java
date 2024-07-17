/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5. */

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int quantidade;
        double nota1, nota2, nota3;

        System.out.print("Informe quantas vezes calcular: ");
        quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Informe os três números: ");
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();

            System.out.printf("A média é: %.1f \n", (2 * nota1 + 3 * nota2 + 5 * nota3) / 10);
        }
        sc.close();
    }
}
