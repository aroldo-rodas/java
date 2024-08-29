import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Mouse",  50.0));
        lista.add(new Produto("Tablet", 350.0));
        lista.add(new Produto("HD Case", 80.90));

        //Implementação com lambda inline
        lista.forEach(p -> p.setPreco(p.getPreco() * 1.1));

        //Reference method para o Sout
        lista.forEach(System.out::println);
    }
}
