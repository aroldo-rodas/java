package model.services;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Nota;

public class AluguelService {
    private Double precoHora;
    private Double precoDia;

    private BrasilTaxa taxa;

    public AluguelService(Double precoHora, Double precoDia, BrasilTaxa taxa) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxa = taxa;
    }

    public void processarFatura(AluguelCarro aluguelCarro) {
        double minutos =  Duration.between(aluguelCarro.getFim(), aluguelCarro.getInicio()).toMinutes();
        double horas = minutos / 60.0;
        
        double pagamentoBasico;
        if(horas <= 12) {
            pagamentoBasico = this.precoHora * Math.ceil(horas);
        }
        else {
            pagamentoBasico = this.precoDia * Math.ceil(horas / 24);
        }

        double taxaPagar =  taxa.taxa(pagamentoBasico);

        aluguelCarro.setNota(new Nota(pagamentoBasico, taxaPagar));
    }

}
