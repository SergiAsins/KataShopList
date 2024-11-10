package Supermarket;

public class BookProduct extends Product {
    private final String author;
    private final String description;

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
