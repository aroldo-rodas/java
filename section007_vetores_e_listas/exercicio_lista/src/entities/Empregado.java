package entities;

public class Empregado {
    //Atributos
    private Integer id;
    private String nome;
    private Double salario;

    //Construtor
    public Empregado(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    //Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //Métodos
    public void aumentarSalario(Double porcentagem) {
        double novoSalario = getSalario() + getSalario() * (porcentagem/100.0);
        this.setSalario(novoSalario);
    }
    
    public String toString() {
        return id + ", " + 
            getNome() + ", " + 
            String.format("R$ %.2f", getSalario());

    }
}
