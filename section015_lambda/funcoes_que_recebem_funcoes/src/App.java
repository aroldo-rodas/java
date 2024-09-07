import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Mouse", 50.0));
        lista.add(new Produto("Tablet", 350.50));
        lista.add(new Produto("HD Case", 80.90));

        ProdutoService ps = new ProdutoService();

        double soma = ps.filter(lista, p -> p.getNome().charAt(0) == 'T');

        System.out.println(soma);
    }
}