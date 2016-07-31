package shopBayers.exceptions;

/**
 * Created by Magi on 31.7.2016 г..
 */
public class BuyerException extends Exception {
    public BuyerException() {
        super();
    }

    public BuyerException(String msg) {
        super(msg);
    }

    public BuyerException(Exception cause) {
        super(cause);
    }

    public BuyerException(String msg, Exception cause) {
        super(msg, cause);
    }
}
