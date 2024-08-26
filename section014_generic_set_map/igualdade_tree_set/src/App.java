import java.util.TreeSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        //Quando usamos o TreeSet, tem que implementar o Comparable na classe
        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("Tv", 900.0));
        set.add(new Produto("Notebook", 1200.0));
        set.add(new Produto("Tablet", 400.0));


        for(Produto p : set) {
            System.out.println(p);
        }
    }
}
