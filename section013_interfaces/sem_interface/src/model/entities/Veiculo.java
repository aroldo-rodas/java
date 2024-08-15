package model.entities;

public class Veiculo {
    //Atributos
    private String nome;

    //Construtor
    public Veiculo() {
    }

    public Veiculo(String nome) {
        this.nome = nome;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
