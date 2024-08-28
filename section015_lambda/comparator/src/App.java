import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> lista = new ArrayList<>();
        
        lista.add(new Produto("Tv", 900.0));
        lista.add(new Produto("Notebook", 1200.0));
        lista.add(new Produto("Tablet", 450.0));

        System.out.println(lista);

        //Uma das formas de definir o comparator no sort
        lista.sort(new MeuComparator());

        System.out.println(lista);
    }
}
