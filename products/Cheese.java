package shopBayers.products;

import shopBayers.ProductByKg;
import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Cheese extends ProductByKg {

    public Cheese(String name, double price, double quantity) throws ProductException {
        super(name, price, quantity);
    }
}
