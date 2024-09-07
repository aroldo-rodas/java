package aplication;

import entities.Funcionario;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String path = "/home/aroldo/Documentos/Java/section015_lambda/exercicio_proposto/src/arquivo/arquivo.csv";
        List<Funcionario> listaFuncionario = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            System.out.print("Informe o salário: ");
            double salario = sc.nextDouble();

            //Cria uma lista a partir do CSV
            while(line != null) {
                String[] filds = line.split(",");

                listaFuncionario.add(new Funcionario(filds[0], filds[1], Double.parseDouble(filds[2])));

                line = br.readLine();
            }

            //Cria lista de emails com salário determinado pelo user
            List<String> listaEmail = listaFuncionario.stream()
                                        .filter(p -> p.getSalario() > salario)
                                        .map(x -> x.getEmail())
                                        .sorted()
                                        .collect(Collectors.toList());

            //Soma dos salários que começam com a letra M
            double soma = listaFuncionario.stream()
                            .filter(p -> p.getNome()
                            .charAt(0) == 'M')
                            .map(p -> p.getSalario())
                            .reduce(0.0, (x, y) -> x + y);

            for(String string : listaEmail) {
                System.out.println(string);
            }

            System.out.println("Soma dos salários com a letra M: " + soma);
        }

        catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
