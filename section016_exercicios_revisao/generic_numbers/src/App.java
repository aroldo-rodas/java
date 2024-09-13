import java.util.ArrayList;
import java.util.List;
import entities.Print;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> numerosDouble = new ArrayList<>();
        List<Integer> numeroInteger = new ArrayList<>();

        numeroInteger.add(1);
        numeroInteger.add(2);
        numeroInteger.add(3);

        numerosDouble.add(1.0);
        numerosDouble.add(2.0);
        numerosDouble.add(3.0);

        Print.print(numeroInteger);
        Print.print(numerosDouble);
    }
}
