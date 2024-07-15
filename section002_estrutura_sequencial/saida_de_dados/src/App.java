import java.util.Locale;

public class App {
    public static void main(String[] args) {
        //Define o lacale US para padronizar a saída de dados
        Locale.setDefault(Locale.US);

        double numero = 10.345678;
        String nome = "Bagio Bergado";
        double salario = 12000.0;
        int idade = 25;

        //saida de dados ponto flutuantes
        System.out.printf("%s tem %d anos e recebe %.2f, seu identificador é %f. \n", nome, idade, salario, numero);
    }
}
