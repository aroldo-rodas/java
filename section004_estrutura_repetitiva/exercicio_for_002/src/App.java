/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo). */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x, n, in = 0, out = 0; 

        System.out.print("Informe um número: ");
        x = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < x; i++) {
            System.out.print("Avaliar número: ");
            n = sc.nextInt();

            if(n >= 10 && n <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println("IN: " + in);
        System.out.println("OUT: " + out);
    }
}
