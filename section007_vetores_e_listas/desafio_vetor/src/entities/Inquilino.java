package entities;

public class Inquilino {
    //Atributos
    private String nomeInquilino;
    private String emailInquilino;
    private int quartoInquilino;

    //Construtor
    public Inquilino(String nomeInquilino, String emailInquilino, int quartoInquilino) {
        this.nomeInquilino = nomeInquilino;
        this.emailInquilino = emailInquilino;
        this.quartoInquilino =quartoInquilino;
    }

    //Getters e Setters
    public String getNomeInquilino() {
        return nomeInquilino;
    }

    public void setNomeInquilino(String nomeInquilino) {
        this.nomeInquilino = nomeInquilino;
    }

    public String getEmailInquilino() {
        return emailInquilino;
    }

    public void setEmailInquilino(String emailInquilino) {
        this.emailInquilino = emailInquilino;
    }

    public int getQuartoInquilino() {
        return quartoInquilino;
    }

    public void setQuartoInquilino(int quartoInquilino) {
        this.quartoInquilino = quartoInquilino;
    }

    //Métodos
    public String toString() {
        return getQuartoInquilino() +
        ": " + getNomeInquilino() +
        ", " + getEmailInquilino();
    }
}
