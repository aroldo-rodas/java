import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Produto> set = new HashSet<>();

        //Conjunto de produtos com o hashCode e equals baseados em nome
        set.add(new Produto("Tv", 900.0));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));


        Produto p = new Produto("Notebook", 1200.00);
        
        System.out.println(set.contains(p));
    }
}
