package entities;

public class ConversorDolar {
    public static double conversor(double valorDolar, double quantidadeDolar) {
        double valorSemImposto =  valorDolar * quantidadeDolar;
        return  valorSemImposto + valorSemImposto * (6.0/100.0);
    }
     
}