import java.util.Comparator;

//Uma maneira de definir o comparator no sort
public class MeuComparator implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
    
}
