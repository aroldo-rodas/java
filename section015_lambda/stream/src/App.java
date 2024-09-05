import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(10);
        lista.add(7);

        //Criando stream a partir da coleção - Map aplica uma função para cada elemento da lista
        Stream<Integer> st1 = lista.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        //Craindo stream
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        //Criando stream - função de interação
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(20).toArray()));
    }
}
