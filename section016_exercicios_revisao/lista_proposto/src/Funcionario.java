public class Funcionario {
    //Atributos
    private Integer id;
    private String nome;
    private Double salario;
    
    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

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

    public String toString() {
        return this.getId() + ", " + this.getNome() + ", " + String.format("%.2f", this.getSalario());
    }
    
    public void aumentarSalario(double valor) {
        this.salario += this.salario * (valor / 100.0);
    }
}
