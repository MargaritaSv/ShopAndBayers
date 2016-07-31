package shopBayers;

import shopBayers.products.Cheese;

import java.util.ArrayList;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Shop {
    private String name;
    private String address;
    private double money;
    private int numberOfProducts;
    private ArrayList<Product> products;

    public Shop(String name, String address, double money, int numberOfProducts) {
        this.setName(name);
        this.setAddress(address);
        this.setMoney(money);
        this.setNumberOfProducts(numberOfProducts);
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("The name is not correct");
        }
        this.name = name;
    }

    private void setAddress(String address) {
        if (address == null || address.trim().length() == 0) {
            throw new IllegalArgumentException("The address is not correct");
        }
        this.address = address;
    }

    private void setMoney(double money) {
        if (money <= 0.0) {
            throw new IllegalArgumentException("The money must be more than zero");
        }
        this.money = money;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        if (numberOfProducts <= 0) {
            throw new IllegalArgumentException("Number of products must be more than zero");
        }
        this.numberOfProducts = numberOfProducts;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addProduct(Product[] product) {
        for (int i = 0; i < product.length; i++) {
            products.add(product[i]);
        }
    }

    public void addMoneyInShop(double moneyFromBuyer) {
        this.money += moneyFromBuyer;
    }

    @Override
    public String toString() {
        return this.name + " " + "on address: " + this.address + " has capital " + this.money + " with number of products " + this.numberOfProducts;
    }


}
