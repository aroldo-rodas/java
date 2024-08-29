import java.util.function.Consumer;

//Implementação da interface
public class AumentarPreco implements Consumer<Produto> {

    @Override
    public void accept(Produto produto) {
       produto.setPreco(produto.getPreco() * 1.10);
    }
    
}
