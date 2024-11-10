package Supermarket;

public class BookProduct extends Product {
    private String author;
    private String description;
    private float discount;

    public BookProduct(String name, double price, float discount, String author, String description) {
        super(name, price, discount);
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }
}
