package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Retangulo retangulo = new Retangulo();

        System.out.print("Informe a largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Informe a altura: ");
        retangulo.altura = sc.nextDouble();
        sc.close();
        
        System.out.printf("Area: %.2f \n", retangulo.area());
        System.out.printf("Perimetro: %.2f \n", retangulo.perimetro());
        System.out.printf("Diagonal: %.2f \n", retangulo.diagonal());
    }
}
