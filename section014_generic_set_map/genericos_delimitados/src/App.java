import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "/home/aroldo/Documentos/Java/section014_generic_set_map/genericos_delimitados/src/arquivo.csv";
        List<Product> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] data = line.split(",");
                list.add(new Product(data[0], Double.parseDouble(data[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            
            System.out.println(x);
            
        }
        catch(RuntimeException e) {
            System.out.println("Erro " + e.getMessage());
        }

    }
}
