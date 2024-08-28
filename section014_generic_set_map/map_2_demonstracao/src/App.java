import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Produto, Double> stock = new HashMap<>();

        Produto p1 = new Produto("Tv", 900.0);
        Produto p2 = new Produto("Notebook", 1200.0);
        Produto p3 = new Produto("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Produto ps = new Produto("Tv", 900.0);

        System.out.println("Contém 'ps' key: " + stock.containsKey(ps));
    }
}
