package model.services;

import java.time.Duration;
import java.time.LocalDateTime;

import model.entities.Carro;

public class AlugarService {
    //Atributos
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private Double precoHora;
    private Double precoDia;

    private Carro carroModelo;

    //Construtores
    public AlugarService() {
    }

    public AlugarService(LocalDateTime inicio, LocalDateTime fim, Double precoHora, Double precoDia,
            Carro carroModelo) {
        this.inicio = inicio;
        this.fim = fim;
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.carroModelo = carroModelo;
    }

    //Getters e Setters
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

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }

    public Carro getCarroModelo() {
        return carroModelo;
    }

    public void setCarroModelo(Carro carroModelo) {
        this.carroModelo = carroModelo;
    }
    
    //Métodos
    private double[] calcularImposto() {
        double tempo =  Duration.between(this.inicio, this.fim).toMinutes();
        double horas = tempo / 60.0;
        double valorTotal;
        double pagamentoBasico;
        double imposto;

        //Tempo do aluguel menor que 12 horas
        if(horas <= 12) {
            pagamentoBasico = precoHora * Math.ceil(horas);

            if(pagamentoBasico <= 100.0) {
                imposto = pagamentoBasico * 0.20;
                valorTotal = pagamentoBasico + imposto;
            }
            else {
                imposto = pagamentoBasico * 0.15;
                valorTotal = pagamentoBasico + imposto;
            }
            
        }
        else {
            //Passou de 12 horas contabiliza como dia
            pagamentoBasico = this.precoDia * Math.ceil(horas / 24.0);
            
            if ((pagamentoBasico <= 100)) {
                imposto = pagamentoBasico * 0.20;
                valorTotal = pagamentoBasico + imposto;
            }
            else {
                imposto = pagamentoBasico * 0.15;
                valorTotal = pagamentoBasico + imposto;
            }
        }

        double[] valores = new double[] {valorTotal, pagamentoBasico, imposto};

        return valores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        double[] valores = calcularImposto();

        sb.append("Pagameno básico: " + valores[1]);
        sb.append("\nImposto: " + valores[2]);
        sb.append("\nPagamento total: " + valores[0]);

        return sb.toString();
    }
}