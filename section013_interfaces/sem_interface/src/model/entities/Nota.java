package model.entities;

public class Nota {
    //Atributos
    private Double pagamentoBasico;
    private Double taxa;

    //Construtores
    public Nota() {
    }

    public Nota(Double pagamentoBasico, Double taxa) {
        this.pagamentoBasico = pagamentoBasico;
        this.taxa = taxa;
    }

    //Getters e Setters
    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }

    public void setPagamentoBasico(Double pagamentoBasico) {
        this.pagamentoBasico = pagamentoBasico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    //Métodos
    public Double getPagamentototal() {
        return getPagamentoBasico() + getTaxa();
    }
    
}
