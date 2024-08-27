import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();
        Set<Integer> alunosTotal = new HashSet<>();

        System.out.print("Quantos do curso A: ");
        int quantidade = sc.nextInt();
        adicionarElemento(cursoA, quantidade);

        System.out.print("Quantos do curso B: ");
        quantidade = sc.nextInt();
        adicionarElemento(cursoB, quantidade);

        System.out.print("Quantos do curso C: ");
        quantidade = sc.nextInt();
        adicionarElemento(cursoC, quantidade);

       contarAlunos(cursoA, cursoB, cursoC, alunosTotal);

       System.out.println(alunosTotal.size());
        sc.close();        
    }

    //Adiciona elementos no Set
    public static void adicionarElemento(Set<Integer> curso, int quantidade) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < quantidade; i++) {
            System.out.print("id: ");
            curso.add(sc.nextInt());
        }

        sc.close();
    }

    //Adicionar elementos na lista alunos
    public static void contarAlunos(Set<Integer> cursoA, Set<Integer> cursoB, Set<Integer> cursoC, Set<Integer> alunosTotal) {
        for(Integer i : cursoA) {
            alunosTotal.add(i);
        }

        for(Integer i : cursoB) {
            alunosTotal.add(i);
        }

        for(Integer i : cursoC) {
            alunosTotal.add(i);
        }
    }
}
