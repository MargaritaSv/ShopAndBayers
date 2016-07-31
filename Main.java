package shopBayers;

import shopBayers.products.*;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Main {
    public static void main(String[] args) {
        try {
            Shop billa = new Shop("Billa", "Sofiq, Lulin", 10000, 10);
            System.out.println(billa.toString());

            Cheese cheese = new Cheese("cheder", 7, 500.0);
            Meat chicken = new Meat("chicken", 4, 834.0);
            Fish octopus = new Fish("octopus", 17, 400.0);

            Beer dab = new Beer("DAB", 1, 150);
            Chair chair = new Chair("NormalChair", 8, 45);
            Book crossingStar = new Book("CrossingStar", 12, 34);
            System.out.println(dab);

            billa.addProduct(cheese);
            billa.addProduct(new Product[]{chicken, octopus, dab, chair, crossingStar});

            IBuyer magi = IBuyer.createBayer("Magi", billa, 800.0, 5);
            IBuyer stefan = IBuyer.createBayer("Stephan", billa, 3000.0, 10);
            IBuyer katq = IBuyer.createBayer("Katq", billa, 2500, 4);

            magi.addProductByKg(chicken, 300);
            magi.addProductByCount(dab, 8);
            magi.addProductByKg(chicken, 300);

            magi.removeProductByKg(chicken, 500);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
