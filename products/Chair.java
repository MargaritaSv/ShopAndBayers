package shopBayers.products;

import shopBayers.ProductByCount;
import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Chair extends ProductByCount {
    public Chair(String name, double price, int quantity) throws ProductException {
        super(name, price, quantity);
    }
}
