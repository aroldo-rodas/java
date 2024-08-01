package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    //Atributos
    private LocalDate manufacture;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Construtores
    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    //Getters e Setters
    public LocalDate getManufacture() {
        return manufacture;
    }

    public void setManufacture(LocalDate manufacture) {
        this.manufacture = manufacture;
    }

    //Métodos
    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName() + " (used) $ ");
        sb.append(this.getPrice());
        sb.append(" (manufacture date: " + this.getManufacture().format(fmt) + ")");
        return sb.toString();
    }
}