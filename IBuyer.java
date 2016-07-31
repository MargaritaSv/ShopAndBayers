package shopBayers;

import shopBayers.exceptions.ProductException;

/**
 * Created by Magi on 31.7.2016 г..
 */
public interface IBuyer {
    void addProductByKg(ProductByKg product, double amount) throws ProductException;

    void addProductByCount(ProductByCount product, int amount)throws ProductException;

    void removeProductByKg(ProductByKg product, double amount) throws ProductException;

    void removeProductByCount(ProductByCount product, int amount) throws ProductException;

    void payProducts();

    public static IBuyer createBayer(String name,Shop shop,double money,int neededProducts) throws Exception {
        return new Buyer(name,shop,money,neededProducts);
    }


}
