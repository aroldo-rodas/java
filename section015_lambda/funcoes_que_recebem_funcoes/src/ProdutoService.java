import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {
    //Passando predicado como parâmetro
    public double filter(List<Produto> lista, Predicate<Produto> criterio) {
        double soma = 0;
        for(Produto p : lista) {
            if(criterio.test(p)) {
                soma += p.getPreco();
            }
        }
        return soma;
    }
}