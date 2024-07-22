package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.ConversorDolar;

public class App {
    public static void main(String[] args) throws Exception {
        double precoDolar, quantidadeDolar;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o preço do dolar: ");
        precoDolar = sc.nextDouble();
        System.out.print("Quantos dolares: ");
        quantidadeDolar = sc.nextDouble();
        sc.close();

        System.out.println("A quantidade a ser paga será de :" + ConversorDolar.conversor(precoDolar, quantidadeDolar));
    }
}
