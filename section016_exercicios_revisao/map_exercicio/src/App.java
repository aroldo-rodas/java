import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "/home/aroldo/Documentos/Java/section016_exercicios_revisao/map_exercicio/src/arquivo.csv";
        Map<String, Integer> canditados = new LinkedHashMap<>();

        //Candidatos
        canditados.put("Alex Blue", 0);
        canditados.put("Bob Brown", 0);
        canditados.put("Maria Green", 0);

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] fild = line.split(",");

                if(canditados.containsKey(fild[0])) {
                    int soma = canditados.get(fild[0]) + Integer.parseInt(fild[1]);
                    canditados.put(fild[0], soma);
                }

                line = br.readLine();
            }

            for(String s: canditados.keySet()) {
                System.out.println(s + ": " + canditados.get(s));
            }
        }

        catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
