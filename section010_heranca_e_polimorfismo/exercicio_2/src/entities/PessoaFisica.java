package entities;

public class PessoaFisica extends Pessoa{
    //Atributos
    private Double gastosSaude;

    //Construtores
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    //Getters e Setters
    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    //Métodos
    @Override
    public Double imposto() {
        Double imposto;

        if(this.getRendaAnual() <= 20000.0) {
                if(this.getGastosSaude() > 0.0) {
                    imposto = (this.getRendaAnual()  * 0.15) - this.getGastosSaude() * 0.50;
                }
                else {
                    imposto = (this.getRendaAnual()  * 0.15);
                }
        }
        else {
            if(this.getGastosSaude() > 0.0) {
                imposto = (this.getRendaAnual()  * 0.25) - this.getGastosSaude() * 0.50;
            }
            else {
                imposto = (this.getRendaAnual()  * 0.25);
            }
        }

        return imposto;
    }
    
    @Override
    public String toString() {
        return this.getName() + " $" + String.format("%.2f", this.imposto());
    }
}
