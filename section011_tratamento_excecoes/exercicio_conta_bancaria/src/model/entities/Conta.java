package model.entities;

import model.excpetions.RegrasSaqueException;

public class Conta {
    //Atributos
    private Integer numeroConta;
    private String proprietarioConta;
    private Double saldoConta;
    private double saqueLimite;

    //Construtores
    public Conta() {
    }

    public Conta(Integer numeroConta, String proprietarioConta, Double saldoConta, double saqueLimite) {
        this.numeroConta = numeroConta;
        this.proprietarioConta = proprietarioConta;
        this.saldoConta = saldoConta;
        this.saqueLimite = saqueLimite;
    }

    //Getters e Setters
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public String getProprietarioConta() {
        return proprietarioConta;
    }

    public void setProprietarioConta(String proprietarioConta) {
        this.proprietarioConta = proprietarioConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public double getSaqueLimite() {
        return saqueLimite;
    }

    public void setSaqueLimite(double saqueLimite) {
        this.saqueLimite = saqueLimite;
    }

    //Métodos
    public void deposito(Double valor) {
        this.saldoConta += valor;
    }

    public void saque(Double valor) {
        if(valor > this.saqueLimite) {
            throw new RegrasSaqueException("A quantia excede o limite da conta!");
        }
        if(valor > this.saldoConta) {
            throw new RegrasSaqueException("Salado insuficiente!");
        }

        this.saldoConta -= valor;
        System.out.println("Novo saldo: R$" + this.getSaldoConta());
    }
}