package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidade;
        Aluno[] vetor;

        System.out.print("Informe a quantidade de alunos: ");
        quantidade = sc.nextInt();

        vetor = new Aluno[quantidade];

        for(int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.print("\nNome do aluno: ");
            String nomeAluno = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();

            vetor[i] = new Aluno(nomeAluno, nota1, nota2);
        }

        sc.close();

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i].media() >= 6) {
                System.out.println(vetor[i].getNomeAluno());
            }
        }
    }
}
