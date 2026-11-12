package exceptionalHandling;

class InvalidLoginException extends Exception {

    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class ExceHan6 {

    static void login(String username,
                      String password)
            throws InvalidLoginException {

        if(!username.equals("admin")
                || !password.equals("123")) {

            throw new InvalidLoginException(
                    "Invalid Credentials");
        }

        System.out.println("Login Successful");
    }

    public static void main(String[] args) {

        try {
            login("admin", "111");
        }

        catch(InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}
