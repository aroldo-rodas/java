package entities;

public class OrderItem {
    //Atributos
    private Integer quantity;
    private Double price;

    private Product product;

    //Construtores
    public OrderItem() {
    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    //Getters e setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //Métodos
    public Double subTotal() {
        return getQuantity() * product.getPrice();
    }
}
