package encapsulation.ex4;

class MobilePhone {
    private String brand;
    private String imeiNumber;
    private String password;

    MobilePhone(String brand, String imeiNumber, String password) {
        this.brand = brand;
        this.imeiNumber = imeiNumber;
        this.password = password;
    }

    public String getBrand() {
        return brand;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }


    public void changePassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect old password.");
        }
    }

    public void unlockPhone(String enteredPassword) {
        if (password.equals(enteredPassword)) {
            System.out.println("Phone Unlocked!");
        } else {
            System.out.println("Wrong Password!");
        }
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone(
                "Samsung",
                "56789012345",
                "Vuri3121");

        System.out.println("Brand: " + phone.getBrand());
        System.out.println("IMEI: " + phone.getImeiNumber());

        phone.unlockPhone("1234");

        phone.unlockPhone("admin123");

        phone.changePassword("admin123", "java123");

        phone.unlockPhone("admin123");

        phone.unlockPhone("java123");
    }
}