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

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("The " + this.name + " is not correct");
        }
        this.name = name;
    }

    protected void setPrice(double price) {
        if (price <= 0.0) {
            throw new IllegalArgumentException("The money must be more than zero " + this.name);
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.price+"$";
    }
}
