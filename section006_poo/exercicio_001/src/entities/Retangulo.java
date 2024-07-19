package entities;

public class Retangulo {
    public double largura;
    public double altura;

    public double area() {
        return this.altura * this.largura;
    }

    public double perimetro() {
        return 2 * this.altura + 2 * this.largura;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.largura, 2));
    }

    public String toString() {
        return "Base: " + largura + " Altura: " + altura;
    }
}
