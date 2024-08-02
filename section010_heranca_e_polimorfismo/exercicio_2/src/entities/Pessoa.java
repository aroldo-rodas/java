package entities;

public abstract class Pessoa {
    //Atributos
    private String name;
    private Double rendaAnual;

    //Construtores
    public Pessoa() {
    }

    public Pessoa(String name, Double rendaAnual) {
        this.name = name;
        this.rendaAnual = rendaAnual;
    }

    //Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //Métodos
    public abstract Double imposto();
}