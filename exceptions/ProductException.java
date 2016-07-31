package shopBayers.exceptions;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class ProductException extends Exception {
    public ProductException() {
        super();
    }

    public ProductException(String msg) {
        super(msg);
    }

    public ProductException(Exception cause) {
        super(cause);
    }

    public ProductException(String msg, Exception cause) {
        super(msg, cause);
    }
}
