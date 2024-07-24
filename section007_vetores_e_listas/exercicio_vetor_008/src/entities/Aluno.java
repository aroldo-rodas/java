package entities;

public class Aluno {
    //Atributos
    private String nomeAluno;
    private double nota1, nota2;

    //Construtor
    public Aluno(String nomeAluno, double nota1, double nota2) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Getters e Setters
    public String getNomeAluno() {
        return nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    //Métodos
    public double media() {
        return (this.getNota1() + this.getNota2()) / 2;
    }
}