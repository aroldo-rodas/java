import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaIntegers = new ArrayList<>();
        List<Double> listaDoubles = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        listaIntegers.add(1);
        listaIntegers.add(2);
        listaIntegers.add(3);

        copy(listaIntegers, list);
        print(list);

        listaDoubles.add(1.0);
        listaDoubles.add(2.0);
        listaDoubles.add(3.0);

        System.out.println();

        copy(listaDoubles, list);
        print(list);
    }

    public static void copy(List<? extends Number> lista, List<Object> list) {
        for(Number n : lista) {
            list.add(n);
        }
    }

    public static void print(List<?> list) {
        for(Object o : list) {
            System.out.print(o + " ");
        }
    }
}
