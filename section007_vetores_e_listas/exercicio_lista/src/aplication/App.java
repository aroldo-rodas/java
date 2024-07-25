package aplication;

import entities.Empregado;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //Atributos e lista
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeEmpregados, idAumento;
        List<Empregado> listaEmpregados = new ArrayList<>();

        System.out.print("Informe a quantidade de empregados: ");
        quantidadeEmpregados = sc.nextInt();

        //Preenche lista com quantidade de empregados
        for(int i = 0; i < quantidadeEmpregados; i++) {
            sc.nextLine();
            System.out.println("\nEmpregado #" + (i + 1));
            System.out.print("Informe o id do empregado: ");
            Integer idEmpregado = sc.nextInt();

            sc.nextLine();
            System.out.print("Informe o nome do empregado: ");
            String nomeEmpregado = sc.nextLine();

            System.out.print("Informe o salário do empregado: ");
            Double salarioEmpregado = sc.nextDouble();

            Empregado empregadoNovo = new Empregado(idEmpregado, nomeEmpregado, salarioEmpregado);

            listaEmpregados.add(empregadoNovo);
        }

        System.out.print("\nId do empregado que receberá aumento: ");
        idAumento = sc.nextInt();


        //Recebe a posição se exitir ou null
        Integer posicao = posicaoEmpregado(listaEmpregados, idAumento);

        if(posicao == null) {
            System.out.println("Funcionário não existe!");
        }
        else {
            System.out.print("Informe a porcentagem: ");
            Double porcentagemAumento = sc.nextDouble();
            listaEmpregados.get(posicao).aumentarSalario(porcentagemAumento);
        }

        System.out.println();

        //Imprime empregados
        for(Empregado empregado : listaEmpregados ){
            System.out.println(empregado);
        }

        sc.close();
    }

    //Pega cada elemento da lista e compara o id do empregado com o id recebido
    public static Integer posicaoEmpregado(List<Empregado> lista, int id) {
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId() == id) {
                return id;
            }
        }
        
        return null;
    }
}