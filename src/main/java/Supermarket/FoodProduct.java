package Supermarket;

public class FoodProduct extends Product {
    private float discount;

    public FoodProduct(String name, double price, float discount) {
        super(name, price, discount);
        setDiscount(discount); //Applies discount
    }
}


