package entities;

public class Empregado {
    public String nome;
    public double salario;
    public double taxa;

    public double salarioLiquido() {
        return this.salario - this.taxa;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += (this.salario * (porcentagem / 100));
    }

    public String toString() {
        return "\nEmpregado: " + this.nome + ", R$" + salarioLiquido();
    }
}
