public class Produto implements Identificavel {
    //Atributos

    private Integer id;
    private String nomeProduto;

    //Construtor
    public Produto(Integer id, String nomeProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
    }

    //Getters e Setters
    @Override
    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.nomeProduto;
    }
}
