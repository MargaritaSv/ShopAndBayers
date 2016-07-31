package shopBayers;


import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class ProductByCount extends Product {

    private int quantity;

    public ProductByCount(String name, double price, int quantity) throws ProductException {
        super(name, price);
        this.setQuantity(quantity);
    }


    protected void setQuantity(int quantity) throws ProductException {
        if (quantity <= 0.0) {
            throw new ProductException("The quantity for " + super.getName() + " must be more than zero.");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " the shop has " + this.quantity;
    }


    @Override
    public int compareTo(Object o) {
        return 0 - this.quantity;
    }
}