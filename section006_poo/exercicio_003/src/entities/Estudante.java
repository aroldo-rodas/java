package entities;

public class Estudante {
    public String nome;
    public double nota1, nota2, nota3;
    private boolean aprovado;

    public double verificaAprovacao() {
        double somaDasNotas = (this.nota1 + this.nota2 + this.nota3);
            if(somaDasNotas >= 60.0) {
                this.aprovado = true;
            }
            else {
                this.aprovado = false;
            }
            return somaDasNotas;
    }

    public String toString() {
        double notaFinal = this.verificaAprovacao();

        if(this.aprovado == true) {
            return "Nota final: " + notaFinal + ", APROVADO!";
        }
        else {
            return "Nota final: " + notaFinal + ", RETIDO! Faltam " + Math.abs(notaFinal - 60) + " pontos.";
        }
    }
}
