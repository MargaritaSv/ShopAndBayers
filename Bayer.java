package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Bayer {
    private String name;
    private Shop shop;
    private double money;
    private int maxProducts;

    public Bayer(String name, Shop shop, double money, int maxProducts) {
        this.name = name;
        this.shop = shop;
        this.money = money;
        this.maxProducts = maxProducts;
    }
}
