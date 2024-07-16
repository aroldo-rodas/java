import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double salario;

        System.out.print("Informe o valor do seu salário: ");
        salario = sc.nextDouble();

        if(salario >= 0 && salario <= 2000) {
            System.out.println("Você está isendo de imposto!");
        }
        else if(salario > 2000 && salario <= 3000) {
            System.out.println("Você irá pagar " + ((salario - 2000) * 0.08) + " R$!");
        }
        else if(salario > 3000 && salario <= 4500) {
            System.out.println("Você irá pagar " + ((salario - 3000) * 0.18 + 1000 * 0.08) + " R$!");
        }
        else {
            System.out.println("Você irá pagar " + ((salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08) + " R$!");
        }
    }
}
