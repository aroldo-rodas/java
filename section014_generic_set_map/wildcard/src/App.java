import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Circle> listaCircle = new ArrayList<>();
        List<Rectangle> listaRectangle = new ArrayList<>();


        listaCircle.add(new Circle(2.0));
        listaCircle.add(new Circle(3.0));

        listaRectangle.add(new Rectangle(2.0, 2.0));

        System.out.println(aretaTotal(listaRectangle));
        System.out.println(aretaTotal(listaCircle));

    }

    //Usando o wildcard ? para trabalhar com listas sem saber seu tipo
    public static double aretaTotal(List<? extends Shape> list) {
        double soma = 0;
        for(Shape s : list) {
            soma += s.area();
        }
        return soma;
    } 
}
