package shopBayers;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Magi on 31.7.2016 г..
 */
class Buyer implements IBuyer, Comparable<Product> {
    private String name;
    private Shop shop;
    private double money;
    private int maxProducts;
    private TreeMap<Product, Double> cart;

    Buyer(String name, Shop shop, double money, int maxProducts) {
        this.setName(name);
        this.shop = shop;
        this.setMoney(money);
        this.setMaxProducts(maxProducts);
        this.cart = new TreeMap<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("The " + this.name + " is not correct");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money <= 0.0) {
            throw new IllegalArgumentException(this.name + ": The money must be more than zero.");
        }
        this.money = money;
    }

    private void setMaxProducts(int maxProducts) {
        if (maxProducts <= 0) {
            throw new IllegalArgumentException("Products must be more than zero.");
        }
        this.maxProducts = maxProducts;
    }

    @Override
    public void addProductByKg(ProductByKg product, double amount) {
        if (!shop.getProducts().contains(product)) {
            throw new IllegalArgumentException("The " + product + "doesn't contain in the shop.");
        }
        //TODO:if product amount is biggest than (ostanalata) in shop
        if (!cart.containsKey(product)) {
            cart.put(product, amount);
        } else {
            double oldPrice = cart.get(product);
            //if buyer just added more quantity from this product
            cart.put(product, amount + oldPrice);
        }

    }

    @Override
    public void addProductByCount(ProductByCount product, int amount) {
        if (!shop.getProducts().contains(product)) {
            throw new IllegalArgumentException("The " + product + "doesn't contain in the shop.");
        }
        //TODO:if product amount is biggest than (ostanalata) in shop
        if (!cart.containsKey(product)) {
            cart.put(product, (double) amount);
        } else {
            double oldPrice = cart.get(product);
            //if buyer just added more quantity from this product
            cart.put(product, amount + oldPrice);
        }

    }

    @Override
    public void removeProductByKg(ProductByKg product, double amount) {
//TODO: all product
        //TODO: part of product

    }

    @Override
    public void removeProductByCount(ProductByCount product, int amount) {

    }

    @Override
    public void payProducts() {

    }

    @Override
    public int compareTo(Product o) {
        o.getName().compareTo(o.getName());
        return 1;
    }
}
