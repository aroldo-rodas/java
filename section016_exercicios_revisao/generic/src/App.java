
public class App {
    public static void main(String[] args) throws Exception {
        Repositorio<Pessoa> repPessoa = new Repositorio<>();
        Repositorio<Produto> repProuto = new Repositorio<>();


        repPessoa.adicionar(new Pessoa(1, "Bagio"));
        repPessoa.adicionar(new Pessoa(2, "Aroldo"));

        repProuto.adicionar(new Produto(1, "Ardugino"));
        repProuto.adicionar(new Produto(2, "Bracinho"));

        repPessoa.listar();
        repProuto.listar();

        repPessoa.remover(1);

        repPessoa.listar();
    }
}
