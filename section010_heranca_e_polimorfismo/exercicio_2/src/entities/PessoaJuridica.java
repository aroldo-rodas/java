package entities;

public class PessoaJuridica extends Pessoa{
    //Atributos
    private Integer numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionarios) {
        super(name, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    //Getters e Setters
    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    //Métodos
    @Override
    public Double imposto() {
        Double imposto;

        if(this.getNumeroFuncionarios() > 10) {
            imposto = this.getRendaAnual() * 0.14;
        }
        else {
            imposto = this.getRendaAnual() * 0.16;
        }
        return imposto;
    }
    
    @Override
    public String toString() {
        return this.getName() + " $" + String.format("%.2f", this.imposto());
    }
}
