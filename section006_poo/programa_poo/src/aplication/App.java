package aplication;
//Calcula a área do triângulo e diz qual o maior

import java.util.Scanner;
import java.util.Locale;
import entities.Triangulo;

public class App {
    public static void main(String[] args) {
        double areaA, areaB, p;
        Triangulo trianguloA, trianguloB;

        trianguloA = new Triangulo();
        trianguloB = new Triangulo();

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe os lados: ");
        trianguloA.a = sc.nextDouble();
        trianguloA.b = sc.nextDouble();
        trianguloA.c = sc.nextDouble();

        areaA = trianguloA.area();

        System.out.print("Informe os lados: ");
        trianguloB.a = sc.nextDouble();
        trianguloB.b = sc.nextDouble();
        trianguloB.c = sc.nextDouble();

        areaB = trianguloB.area();

        System.out.println("Area A: " + areaA);
        System.out.println("Area B: " + areaB);

        if(areaA > areaB) {
            System.out.println("Maior área: A!");
        }
        else {
            System.out.println("Maior área: B!");
        }

        sc.close();
    }
}
