package shopBayers;

import shopBayers.exceptions.BuyerException;
import shopBayers.exceptions.ProductException;

import java.util.*;

/**
 * Created by Magi on 31.7.2016 г..
 */
class Buyer implements IBuyer, Comparable<Product> {
    private String name;
    private Shop shop;
    private double money;
    private int maxProducts;
    private TreeMap<Product, Double> cart;

    Buyer(String name, Shop shop, double money, int maxProducts) throws Exception {
        this.setName(name);
        this.shop = shop;
        this.setMoney(money);
        this.setMaxProducts(maxProducts);
        this.cart = new TreeMap<>();
    }

    private void setName(String name) throws BuyerException {
        if (name == null || name.trim().length() == 0) {
            throw new BuyerException("The " + this.name + " is not correct");
        }
        this.name = name;
    }

    private void setMoney(double money) throws BuyerException {
        if (money <= 0.0) {
            throw new BuyerException(this.name + ": The money must be more than zero.");
        }
        this.money = money;
    }

    private void setMaxProducts(int maxProducts) throws ProductException {
        if (maxProducts <= 0) {
            throw new ProductException("Products must be more than zero.");
        }
        this.maxProducts = maxProducts;
    }


    @Override
    public void addProductByKg(ProductByKg product, double amount) {
        if (!shop.getProducts().contains(product)) {
            throw new IllegalArgumentException("The " + product + "doesn't contain in the shop.");
        }
        //TODO:if product amount is biggest than (ostanalata) in shop
        //Product pr = product;
        if (!cart.containsKey(product)) {
            cart.put(product, 0 + amount);
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
    public void removeProductByKg(ProductByKg product, double amount) throws ProductException {
        if (!cart.containsKey(product)) {
            throw new ProductException("The product " + product + " is not in the cart.");
        }

        double exactQuantity = cart.get(product);
        if (exactQuantity < amount) {
            throw new ProductException(this.name + " you can't remove more than you are take.");
        }

        if (exactQuantity == amount) {
            cart.remove(product);
        }

        exactQuantity -= amount;
        cart.put(product, exactQuantity);

    }

    @Override
    public void removeProductByCount(ProductByCount product, int amount) throws ProductException {
        if (!cart.containsKey(product)) {
            throw new ProductException("The product " + product + " is not in the cart.");
        }

        double exactQuantity = cart.get(product);
        if (exactQuantity < amount) {
            throw new ProductException(this.name + " you can't remove more than you are take.");
        }

        if (exactQuantity == amount) {
            cart.remove(product);
        }

        exactQuantity -= amount;
        cart.put(product, exactQuantity);

    }

    @Override
    public void payProducts() {
        double totalMoney = 0;
        for (Map.Entry<Product, Double> pair : cart.entrySet()) {
            totalMoney += pair.getValue() * pair.getKey().getPrice();
        }

        shop.addMoneyInShop(totalMoney);

        if (totalMoney > this.money) {
            throw new IllegalArgumentException("Must return some products. Exceeding the limit with " + Math.abs(totalMoney - this.money));
        }

        this.money -= totalMoney;

    }

    @Override
    public int compareTo(Product o) {
        o.getName().compareTo(o.getName());
        return 1;
    }
}
