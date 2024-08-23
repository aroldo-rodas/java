import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaIntegers = new ArrayList<>();
        List<Double> listaDoubles = new ArrayList<>();
        List<Object> listaObjects = new ArrayList<>();

        listaIntegers.add(1);
        listaIntegers.add(1);
        listaIntegers.add(1);

        listaDoubles.add(2.0);
        listaDoubles.add(2.0);
        listaDoubles.add(2.0);

        copyList(listaIntegers, listaObjects);
        copyList(listaDoubles, listaObjects);

        print(listaObjects);
    }

    //O primeiro wildcard herda Number, ou seja, aceita qualquer tipo de Number
    //O segundo wildcard, irá ser qualquer valor que seja object
    public static void copyList(List<? extends Number> source, List<? super Number> destiny) {
        for(Number n : source) {
            destiny.add(n);
        }
    }

    public static void print(List<?> lista) {
        for(Object obj : lista) {
            System.out.print(obj + " ");
        }
    }
}
