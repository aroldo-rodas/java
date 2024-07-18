package entities;

import java.security.PublicKey;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        return preco * quantidade;
    }

    public void adicionarProduto(int valor) {
        quantidade += valor;    
    } 

    public void removerProduto(int valor) {
        quantidade -= valor;
    }

    public String toString() {
        return "Nome " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade + ", Valor do estoque: " + valorTotalEstoque();
    }
}
