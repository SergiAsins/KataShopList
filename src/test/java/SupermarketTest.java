import Supermarket.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SupermarketTest {
    @Test
    void TestFreeNewProductIsCreated(){
        Product freeProduct = new FreeProduct("Pumpkin");
        assertEquals(0.0, freeProduct.getDiscountedPrice());
    }
    @Test
    void TestPriceIsOneInNewFoodProductIsCreated(){
        Product foodProduct = new FoodProduct("Bread", 1, 0);
        assertEquals(1, foodProduct.getDiscountedPrice());
    }
    @Test
    void  TestNewBookIsCreated(){
        BookProduct bookProduct = new BookProduct("Sapiens", 16, 0 ,"Yuval Noah", "Description of Sapiens");
        assertEquals("Yuval Noah", bookProduct.getAuthor());
        assertEquals("Description of Sapiens", bookProduct.getDescription());
    }

    @Test
    void TestAddDiscountToFoodProduct(){
        Product foodProduct = new FoodProduct("Watermelon", 5, 20);
        assertEquals(4.0, foodProduct.getDiscountedPrice(), 0.0001); //¿? Delta tolerance 0.0001
    }

    @Test
    void TestAddDiscountToBookProduct(){
        Product bookProduct = new BookProduct("Sapiens", 16, 10 ,"Yuval Noah", "Description of Sapiens");
        assertEquals(14.4, bookProduct.getDiscountedPrice(), 0.0001);
    }

    @Test
    void TestAddProductToCart(){
        Cart cart = new Cart();
        Product foodProductToAdd = new FoodProduct("Sugar", 2, 0);
        cart.addProduct(foodProductToAdd);
        assertEquals("Sugar", cart.getCartList().getFirst().getName());
    }

    @Test
    void TestCartCannotRepeatProductName(){
        Cart cart = new Cart();
        Product foodProductToAdd1 = new FoodProduct("Chocolate", 1, 0);
        Product foodProductToAdd2 = new FoodProduct("Chocolate", 1, 10);
        cart.addProduct(foodProductToAdd1);
        cart.addProduct(foodProductToAdd2);
        assertEquals(1, cart.getCartList().size());
    }

    //Podemos consultar la lista de productos añadidos al carrito
}
//arrange
//act
//assert