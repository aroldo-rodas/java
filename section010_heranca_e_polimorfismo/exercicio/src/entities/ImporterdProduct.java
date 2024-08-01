package entities;

public class ImporterdProduct extends Product{
    //Atributos
    private Double customsFee;

    //Construtores
    public ImporterdProduct() {
        super();
    }

    public ImporterdProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    //Getters e Setters
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    //Métodos
    public Double totalPrice() {
        return super.getPrice() + this.getCustomsFee();
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName());
        sb.append(String.format(" $ %.2f", this.totalPrice()));
        sb.append(String.format(" (Customs fee: $ %.2f)", this.getCustomsFee()));
        sb.append(")");
        return sb.toString();
    }
}