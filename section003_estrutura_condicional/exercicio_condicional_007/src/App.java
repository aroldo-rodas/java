/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação. */

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x, y;

        System.out.print("Informa uma coordenada: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        sc.close();

        if(x == 0 & y == 0) {
            System.out.println("O ponto está na origem!");
        }
        else if(x > 0 && y > 0) {
            System.out.println("O ponto está em Q1!");
        }
        else if(x < 0 && y > 0) {
            System.out.println("O ponto está em Q2!");
        }
        else if(x < 0 && y < 0) {
            System.out.println("O ponto está em Q3!");
        }
        else if(x > 0 && y < 0) {
            System.out.println("O ponto está em Q4!");
        }
        else {
            System.out.println("O ponto está em um dos eixos!");
        }
    }
}
