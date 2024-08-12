import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cidades = new String[] {"Campo Grande - MS", "Manaus - AM", "Florianópolis - SC"};

        String path = "/home/aroldo/Documentos/Java/section012_arquivos/fileWriter_bufferedWriter/arquivo";

        //Para não recriar o arquivo, bata colocar true no parâmetro do FileWriter
        try(BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            for(String line : cidades) {
                br.write(line);
                br.newLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
