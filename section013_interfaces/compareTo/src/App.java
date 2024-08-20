import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa("Fabio", 45);
        Pessoa p2 = new Pessoa( "Banjo", 34);
        Pessoa p3 = new Pessoa("Bagio", 24);
        Pessoa p4 = new Pessoa("Baco", 12);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);
    }
}
