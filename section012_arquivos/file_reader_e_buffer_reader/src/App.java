import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        String userHome = System.getProperty("user.home");
        String path = (userHome + "/Documentos/Java/section012_arquivos/file_reader_e_buffer_reader/src/arquivo");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linha = br.readLine();

            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(fr != null) {
                    fr.close();
                }
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
