import java.util.List;
import java.util.ArrayList;

//Para qualquer classe que usa ID
public class Repositorio<T extends Identificavel> {

    //Repositorio
    private List<T> lista = new ArrayList<>();

    //Adiciona elemento ao repositório
    public void adicionar(T objeto) {
        lista.add(objeto);
    }

    //Remove item pelo id
    public void remover(int id) {
        lista.removeIf(x -> x.getId() == id);
    }

    //Busca item pelo id
    public T buscarPorId(int id) {
        return lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }
    
    //Listar
    public void listar() {
        for(T objeto: lista) {
            System.out.println(objeto);
        }
    }
}