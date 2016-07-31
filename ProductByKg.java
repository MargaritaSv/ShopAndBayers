package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class ProductByKg extends Product {
    private double quantity;

    public ProductByKg(String name, double price, double quantity) {
        super(name, price);
        this.setQuantity(quantity);
    }

    protected void setQuantity(double quantity) {
        if (quantity <= 0.0) {
            throw new IllegalArgumentException("The quantity for " + super.getName() + " must be more than zero");
        }
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " with " + this.quantity + "kg";
    }

    @Override
    public int compareTo(Object o) {
//return o -Integer.valueOf((int) this.quantity);
        return 0;
    }
}
