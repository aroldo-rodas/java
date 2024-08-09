import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        File arq = new File("/home/aroldo/Documentos/arquivo.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(arq);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }



    }
}
