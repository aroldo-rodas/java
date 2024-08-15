package model.entities;

import java.time.LocalDateTime;

public class AluguelCarro {
    //Atributos
    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Veiculo carro;
    private Nota nota;

    //Construtor
    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo carro) {
        this.inicio = inicio;
        this.fim = fim;
        this.carro = carro;
    }

    //Getters e setters
    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public Veiculo getCarro() {
        return carro;
    }

    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    
}
