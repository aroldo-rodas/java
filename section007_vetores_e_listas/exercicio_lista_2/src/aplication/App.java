package aplication;

import entities.Empregado;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeEpregados, idAumento;
        List<Empregado> listaEmpregados = new ArrayList<>();

        System.out.print("Informe a quantidade de empregados: ");
        quantidadeEpregados = sc.nextInt();

        for(int i = 0; i < quantidadeEpregados; i++) {
            sc.nextLine();
            System.out.println("\nEmpregado: " + (i + 1));
            System.out.print("Informe o id: ");
            Integer id = sc.nextInt();

            while (existeId(listaEmpregados, id)) {
                System.out.print("Id existente, informe outro: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.print("Informe o nome: ");
            String nome = sc.nextLine();

            System.out.print("Informe o salário: ");
            Double salario = sc.nextDouble();

            listaEmpregados.add(new Empregado(id, nome, salario));
        }

        System.out.print("Informe o id do funcionário que receberá aumento: ");
        idAumento = sc.nextInt();

        Empregado empregadoAumento = listaEmpregados.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

        if(empregadoAumento == null){
            System.out.println("Empregado não existe!");
        }
        else {
            System.out.print("Informe a porcentagem do aumento: ");
            Double porcentagemAumento = sc.nextDouble();
            empregadoAumento.aumentarSalario(porcentagemAumento);
        }

        sc.close();
        System.out.println();

        for(Empregado i : listaEmpregados) {
            System.out.println(i);
        }
    }

    //Se o empregado for nulo, retorna falso, então o while do id será encerrado
    public static Boolean existeId(List<Empregado> lista, Integer id) {
        Empregado empregado = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return ((empregado == null) ? false : true);
    }
}
