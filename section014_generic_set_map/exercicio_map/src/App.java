import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "/home/aroldo/Documentos/Java/section014_generic_set_map/exercicio_map/src/arquivo.csv";
        Map<String, Integer> candidatos = new TreeMap<>();

        //Candidatos
        candidatos.put("Alex Blue", 0);
        candidatos.put("Bob Brown", 0);
        candidatos.put("Maria Green", 0);

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            int soma;

            while(line != null) {
                String[] fild = line.split(",");
                
                if(candidatos.containsKey(fild[0])) {
                    soma = Integer.parseInt(fild[1]);
                    soma += candidatos.get(fild[0]);
                    candidatos.put(fild[0], soma);
                }
                
                line = br.readLine();
            }

            for(String s: candidatos.keySet()) {
                System.out.println(s + ": " + candidatos.get(s));
            }

        }
        catch(RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
