//Calcula a área do triângulo e diz qual o maior

import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        double a, b, c, areaA, areaB, p;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe os lados: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a + b + c) / 2;

        areaA = Math.sqrt(p * (p - a ) * (p - b) * (p - c));

        System.out.print("Informe os lados: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = (a + b + c) / 2;

        sc.close();

        areaB = Math.sqrt(p * (p - a ) * (p - b) * (p - c));

        System.out.println("Area A: " + areaA);
        System.out.println("Area B: " + areaB);

        if(areaA > areaB) {
            System.out.println("Maior área: A!");
        }
        else {
            System.out.println("Maior área: B!");
        }
    }
}
