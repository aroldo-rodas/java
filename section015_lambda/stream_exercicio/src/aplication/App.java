package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "/home/aroldo/Documentos/Java/section015_lambda/stream_exercicio/src/arquivo/arquivo.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Produto> lista = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fild = line.split(",");

                lista.add(new Produto(fild[0], Double.parseDouble(fild[1])));

                line = br.readLine();
            }

            //Primeiro gera um stream usando map pegando apenas os precos, depois aplica o reduce
            double precoMedio = lista.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / lista.size();

            //Criando um comparator
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //Filtra a lista com preço abaixo da media, criam um stram apenas com nome, ordena essa stream com o compareTo
            //usa a collect para transformar para lista novamente
            List<String> nomes = lista.stream().filter(p -> p.getPreco() < precoMedio)
                                    .map(p -> p.getNome())
                                    .sorted(comp.reversed())
                                    .collect(Collectors.toList());

             //Methods reference
             System.out.println(precoMedio);
            nomes.forEach(System.out::println);
        }
        catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
