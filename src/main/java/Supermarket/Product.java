package Supermarket;

public abstract class Product {
    private String name;
    private double price;
    private float discount;

    public Product(String name, double price, float discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    };

    public double getDiscountedPrice(){
        return price * (1 - discount / 100);
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getName() {
        return this.name;
    }
}
