import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        //HashSet, implementação mais rápida mas não garante a ordem
        //LinkedHashSet, manteve a ordem
        //TreeSet, ordena de forma alfabética

        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //Remove
        set.remove("Tablet");

        //Remove com base em um predicado
        set.removeIf(x -> x.length() >= 3);

        System.out.println(set.contains("Notebook"));

        for(String s : set) {
            System.out.println(s);
        }
    }
}
