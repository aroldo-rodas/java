package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Estudante;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Estudante aluno = new Estudante();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();
        sc.close();

        System.out.println(aluno.toString());
    }
}
