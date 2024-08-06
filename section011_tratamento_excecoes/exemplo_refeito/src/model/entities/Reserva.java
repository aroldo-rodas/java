package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.Exceptions.DatasException;;

public class Reserva {
    //Atributos
    private int numeroQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Construtores
    public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate checkOut) {
        //Programação defensiva
        if(checkIn.isAfter(checkOut)) {
            throw new DatasException("Não é possível cadastrar um check in depois do check out!");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //Getters e Setters
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    //Métodos
    public int duracaoDias() {
        Period periodo = Period.between(this.checkOut, this.checkIn);
        return periodo.getDays();
    }

    public void atualizacaoDatas(LocalDate checkIn, LocalDate checkOut){
        LocalDate agora = LocalDate.now();

        if(!checkOut.isAfter(checkIn)) {
            throw new DatasException("Data de checkout inválida!");
        }
        if(checkIn.isBefore(agora) || checkOut.isBefore(agora)) {
            throw new DatasException("Escolha uma data atual!");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quarto: " + this.getNumeroQuarto());
        sb.append(", " + this.getCheckIn().format(fmt));
        sb.append(", " + this.getCheckOut().format(fmt));
        sb.append(", duração de " + Math.abs(duracaoDias()));
        sb.append(" dias.");
        return sb.toString();
    }

}