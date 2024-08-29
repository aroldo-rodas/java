import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Mouse",  50.0));
        lista.add(new Produto("Tablet", 350.0));
        lista.add(new Produto("HD Case", 80.90));

        List<String> nomes = lista.stream().map(new UpperCaseNome()).collect(Collectors.toList());

        nomes.forEach(System.out::println);
    }
}
