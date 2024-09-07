package entities;

public class Funcionario {
    //Atributos
    private String nome;
    private String email;
    private Double salario;

    //Construtor

    public Funcionario() {

    }

    public Funcionario(String nome, String email, Double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //Métodos
    public String toString() {
        return this.getNome() + "," + this.getEmail() + "," + this.getSalario();
    }
}
