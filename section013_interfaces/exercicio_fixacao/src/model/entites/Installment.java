package model.entites;

import java.time.LocalDate;

public class Installment {
    //Atributos
    private LocalDate dueDate;
    private Double quantia;

    //Construtores
    public Installment() {
    }

    public Installment(LocalDate dueDate, Double quantia) {
        this.dueDate = dueDate;
        this.quantia = quantia;
    }

    //Getters e Setters
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }
}
