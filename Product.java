package shopBayers;

import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public abstract class Product implements Comparable {
    private String name;
    private double price;

    public Product(String name, double price) throws ProductException {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }


    protected void setName(String name) throws ProductException {
        if (name == null || name.trim().length() == 0) {
            throw new ProductException("The " + this.name + " is not correct");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) throws ProductException {
        if (price <= 0.0) {
            throw new ProductException("The money " + this.name + " must be more than zero.");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + this.price + "$";
    }
}
