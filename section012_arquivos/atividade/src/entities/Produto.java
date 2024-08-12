 package entities;

public class Produto {
    //Atributos
    private String nomeProduto;
    private Double precoProduto;

    //Construtor
    public Produto(String nomeProduto, Double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    //Getters e Setters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    //Métodos
    @Override
    public String toString() {
        return this.getNomeProduto() + "," + this.getPrecoProduto();
    }
}