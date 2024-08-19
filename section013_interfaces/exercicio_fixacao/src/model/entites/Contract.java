package model.entites;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contract {
    //Atributos
    private Integer number;
    private LocalDate date;
    private Double totalValue;

    List<Installment> installments = new ArrayList<>();

    //Construtores
    public Contract() {
    }

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    //Getters e Setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    //Métodos
    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }
}
