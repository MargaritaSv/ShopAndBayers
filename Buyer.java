package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
class Buyer implements IBuyer {
    private String name;
    private Shop shop;
    private double money;
    private int maxProducts;

    Buyer(String name, Shop shop, double money, int maxProducts) {
        this.setName(name);
        this.shop = shop;
        this.setMoney(money);
        this.setMaxProducts(maxProducts);
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

    }

    @Override
    public void addProductByCount(ProductByCount product, int amount) {

    }

    @Override
    public void removeProductByKg(ProductByKg product, double amount) {

    }

    @Override
    public void removeProductByCount(ProductByCount product, int amount) {

    }

    @Override
    public void payProducts() {

    }
}
