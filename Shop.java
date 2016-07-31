package shopBayers;

import java.util.ArrayList;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Shop {
    private String name;
    private String address;
    private double money;
    private ArrayList<Product> products;

    public Shop(String name, String address, double money) {
        this.name = name;
        this.address = address;
        this.money = money;
    }
}
