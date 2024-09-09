import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Integer> alunos = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Alunos do curso A: ");
        adicionarAluno(alunos, sc.nextInt());

        System.out.print("Alunos do curso B: ");
        adicionarAluno(alunos, sc.nextInt());

        System.out.print("Alunos do curso C: ");
        adicionarAluno(alunos, sc.nextInt());

        System.out.println("Quantidade de alunos: " + alunos.size());

        sc.close();
    }

    public static void adicionarAluno(Set<Integer> alunos, int quantidade) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < quantidade; i++) {
            System.out.print("id: ");
            int valor = sc.nextInt();
            alunos.add(valor);
        }
    }
}
