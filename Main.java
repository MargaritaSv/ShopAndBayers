package shopBayers;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class Main {
    public static void main(String[] args) {
        try {
            Shop billa = new Shop("Billa", "Sofiq, Lulin", 10000, 10);
            System.out.println(billa.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }


}
