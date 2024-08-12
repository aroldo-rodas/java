package aplication;

import entities.Produto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        String path = "/home/aroldo/Documentos/Java/section012_arquivos/atividade/src/data/ListaProdutos";
        List<Produto> listaProdutos = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                //Vetor com os dados referente a linha
                String[] foo = line.split(",");
                
                //Adiciona o produto e múltiplica a quantidade pelo preço
                listaProdutos.add(new Produto(foo[0], Double.parseDouble(foo[1]) * Double.parseDouble(foo[2])));
                line = br.readLine();
            }

            for(Produto p : listaProdutos) {
                System.out.println(p.toString());
            }

        }
        catch(IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Erro:" + e.getMessage());
        }

    }
}
