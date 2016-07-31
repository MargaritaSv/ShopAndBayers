package shopBayers;

import shopBayers.products.*;

import java.util.ArrayList;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Main {
    public static void main(String[] args) {
        try {

//create shop
            Shop billa = new Shop("Billa", "Sofiq, Lulin", 10000, 10);

//create some products
            Cheese cheese = new Cheese("cheder", 7, 500.0);
            Meat chicken = new Meat("chicken", 4, 834.0);
            Fish octopus = new Fish("octopus", 17, 400.0);

            Beer dab = new Beer("DAB", 1, 150);
            Chair chair = new Chair("NormalChair", 8, 45);
            Book crossingStar = new Book("CrossingStar", 12, 34);

//added this products
            billa.addProduct(cheese);
            billa.addProduct(new Product[]{chicken, octopus, dab, chair, crossingStar});


            print(billa);

//create buyers
            IBuyer magi = IBuyer.createBayer("Magi", billa, 800.0, 5);
            IBuyer stefan = IBuyer.createBayer("Stephan", billa, 3000.0, 10);
            IBuyer katq = IBuyer.createBayer("Katq", billa, 2500, 4);

//wanted to bue/remove products
            magi.addProductByKg(chicken, 300);
            magi.addProductByCount(dab, 8);
            magi.addProductByKg(chicken, 300);

            magi.removeProductByKg(chicken, 500);

//try to pay
            magi.payProducts();

            print(billa);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void print(Shop billa) {
        StringBuilder sB = new StringBuilder();
        sB.append(billa).append("\n").append("Products in shop:").append("\n");

        ArrayList<Product> products = (ArrayList<Product>) billa.getProducts().clone();
        for (int i = 0; i < products.size(); i++) {
            sB.append(products.get(i)).append(System.lineSeparator());

        }
        sB.append("-------------------------");
        System.out.println(sB.toString());
    }
}