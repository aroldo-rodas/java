import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa";
        
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double media = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, o preço é $%.2f \n%s, o preço é $%.2f \n", produto1, preco1, produto2, preco2);

        System.out.printf("\nGravação: %d anos, codigo %d e genero: %c\n", idade, codigo, genero);

        System.out.println("\nMédia com vaŕias casas decimais " + media);
        System.out.printf("Arredonda para 3 casas decimais %.3f \n", media);

        Locale.setDefault(Locale.US);

        System.out.printf("Usando ponto: %.3f\n", media);
    }
}
