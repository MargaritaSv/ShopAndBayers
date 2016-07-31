package shopBayers.products;

import shopBayers.ProductByCount;
import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Beer extends ProductByCount {
    public Beer(String name, double price, int quantity) throws ProductException {
        super(name, price, quantity);
    }
}
