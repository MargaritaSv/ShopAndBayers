package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
