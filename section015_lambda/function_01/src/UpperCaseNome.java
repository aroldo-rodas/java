import java.util.function.Function;

public class UpperCaseNome implements Function<Produto, String> {

    @Override
    public String apply(Produto p) {
        return p.getNome().toLowerCase();
    }
    
}
