import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        String userHome = System.getProperty("user.home");
        String path = (userHome + "/Documentos/Java/section012_arquivos/file_reader_e_buffer_reader/src/arquivo");

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();

            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
