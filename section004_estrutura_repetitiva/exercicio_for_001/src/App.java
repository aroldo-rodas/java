/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Informe um número: ");
        x = sc.nextInt();
        sc.close();

        for(int i = 0; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
