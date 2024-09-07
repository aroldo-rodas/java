import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Informa a quantidade de empregados: ");
        int quantidade = sc.nextInt();

        for(int i = 1; i <= quantidade; i++) {
            System.out.print("Id: ");
            int id = sc.nextInt();

            //Enquanto id for repetido
            while (verificaId(lista, id) != null) {
                System.out.println("Informe um novo id: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            lista.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Id para receber aumento: ");
        int idAumento = sc.nextInt();

        Funcionario aumentarSalarioFunc = verificaId(lista, idAumento);

        if(aumentarSalarioFunc != null) {
            System.out.print("Informe a porcentagem: ");
            double porcentagem = sc.nextInt();
            aumentarSalarioFunc.aumentarSalario(porcentagem);
        }
        else {
            System.out.println("Id não existe!");
        }
        
        lista.forEach(System.out::println);

        sc.close();
    }

    //Função que verifica id
    public static Funcionario verificaId(List<Funcionario> lista, int id) {
        Funcionario funcId = lista.stream()
                                .filter(x -> x.getId() == id)
                                .findFirst()
                                .orElse(null);
        return funcId;
    }
}