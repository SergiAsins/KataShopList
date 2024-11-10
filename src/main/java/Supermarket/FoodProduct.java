package Supermarket;

public class FoodProduct extends Product {

    public FoodProduct(String name, double price, float discount) {
        super(name, price, discount);
        setDiscount(discount); //Applies discount
    }
}


