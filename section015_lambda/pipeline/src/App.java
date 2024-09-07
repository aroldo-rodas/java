import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = Arrays.asList(3, 4, 5, 10, 7);

        //0, (subtotal, element) -> subtotal + element
        int sum = lista.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        List<Integer> newLista = lista.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        System.out.println(Arrays.toString(newLista.toArray()));
    }
}
