import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Mouse",  50.0));
        lista.add(new Produto("Tablet", 350.0));
        lista.add(new Produto("HD Case", 80.90));

        System.out.println(lista);

        //Method Reference
        lista.removeIf(Produto::staticPredicate);

        System.out.println(lista);
    }

    
}
