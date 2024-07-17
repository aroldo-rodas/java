/* Ler um número inteiro N e calcular todos os seus divisores */

import java.util.Scanner
;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Informe um número: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
