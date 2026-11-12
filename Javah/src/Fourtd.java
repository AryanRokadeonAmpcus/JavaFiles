class InvalidMobileException extends Exception {

    InvalidMobileException(String msg) {
        super(msg);
    }
}

public class Fourtd
{

    static void checkMobile(String mobile)
            throws InvalidMobileException {

        if(mobile.length() != 10) {
            throw new InvalidMobileException(
                    "Mobile number must be 10 digits");
        }

        System.out.println("Valid Mobile Number");
    }

    public static void main(String[] args) {

        try {
            checkMobile("hbujhbhb");
        }
        catch(InvalidMobileException e) {
            System.out.println(e.getMessage());
        }
    }
}