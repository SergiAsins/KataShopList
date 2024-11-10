package Supermarket;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartList = new ArrayList<>();

    public void addProduct(Product foodProductToAdd) {
        boolean isDuplicate = false;

        for (Product product : cartList) {
            if (product.getName().equals(foodProductToAdd.getName())) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            cartList.add(foodProductToAdd);
        }
    }

    public ArrayList<Product> getCartList() {
        return cartList;
    }
}

