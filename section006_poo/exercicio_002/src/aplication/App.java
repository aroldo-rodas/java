package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Empregado;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Empregado empregado = new Empregado();

        System.out.print("Informe o nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Informe o salário bruto: ");
        empregado.salario = sc.nextDouble();
        System.out.print("Informe o imposto: ");
        empregado.taxa = sc.nextDouble();

        System.out.println(empregado.toString());
        System.out.print("Aumento de salario: ");
        empregado.aumentarSalario(sc.nextDouble());
        System.out.println(empregado.toString());
        sc.close();
    }
}
