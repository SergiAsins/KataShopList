package Supermarket;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartList = new ArrayList<>();

    public void addProduct(Product foodProductToAdd){
        cartList.add(foodProductToAdd);
    }

    public ArrayList<Product> getCartList() {
        return cartList;
    }
}
