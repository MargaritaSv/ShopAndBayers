package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public interface IBuyer {
    void addProductByKg(ProductByKg product, double amount);

    void addProductByCount(ProductByCount product, int amount);

    void removeProductByKg(ProductByKg product, double amount);

    void removeProductByCount(ProductByCount product, int amount);

    void payProducts();
}