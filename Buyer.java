package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Buyer {
    private String name;
    private Shop shop;
    private double money;
    private int maxProducts;

    public Buyer(String name, Shop shop, double money, int maxProducts) {
        this.name = name;
        this.shop = shop;
        this.money = money;
        this.maxProducts = maxProducts;
    }
}
