/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inicio, fim;

        System.out.print("Informe o horário inicial e final do jogo: ");
        inicio = sc.nextInt();
        fim = sc.nextInt();
        sc.close();

        if(inicio == fim){
            System.out.println("O jogo durou 24 horas!");
        }
        else if(inicio > fim) {
            System.out.println("O jogo durou " + ((24 - inicio) + fim) + " hotras!");
        }
        else {
            System.out.println("O jogo durou " + (Math.abs(inicio - fim)) + " horas!");
        }
    }
}
