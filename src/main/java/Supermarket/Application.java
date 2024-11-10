
package Supermarket;

public class Application {
    public static void main(String[] args) {
      Product product = new FoodProduct("Strawberries", 10, 10);
      Cart cart = new Cart();
      cart.addProduct(product);
        System.out.println(cart.getCartList().getFirst().getName());
    }


}
