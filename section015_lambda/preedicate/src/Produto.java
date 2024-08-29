public class Produto {
    private String nome;
    private Double preco;
    
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public static boolean staticPredicate(Produto p) {
        return p.getPreco() >= 100.0;
    }

    @Override
    public String toString() {
        return this.getNome() + ", " + this.getPreco();
    }    
}
