package shopBayers;

import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class ProductByKg extends Product {
    private double quantity;

    public ProductByKg(String name, double price, double quantity) throws ProductException {
        super(name, price);
        this.setQuantity(quantity);
    }

    protected void setQuantity(double quantity) throws ProductException {
        if (quantity <= 0.0) {
            throw new ProductException("The quantity for " + super.getName() + " must be more than zero");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " the shop has " + this.quantity + "kg";
    }

    @Override
    public int compareTo(Object o) {
        //TODO: fix all idea
        return 0;
    }
}
