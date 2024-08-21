import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<FiguraUmaUnidade> lista = new ArrayList<>();

        System.out.print("Unidades da figura: ");
        int unidade = sc.nextInt();

        Triangulo triangulo = new Triangulo(unidade);
        Quadrado quadrado = new Quadrado(unidade);

        triangulo.imprimir();

        System.out.println();
        
        quadrado.imprimir();

        lista.add(triangulo);
        lista.add(quadrado);

        sc.close();
    }
}
