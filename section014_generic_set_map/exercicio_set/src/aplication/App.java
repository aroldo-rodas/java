package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

import entities.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "/home/aroldo/Documentos/Java/section014_generic_set_map/exercicio_set/src/arquivo/logs.csv";
        Set<Usuario> lista = new LinkedHashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            //Percorre as linhas
            while(line != null) {
                //vetor de dados recortado pelo " , "
                String[] campo = line.split(",");
                lista.add(new Usuario(campo[0], Instant.parse(campo[1])));
                
                line = br.readLine();
            }

            System.out.println("Total de usuários: " + lista.size());
        }
        catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
