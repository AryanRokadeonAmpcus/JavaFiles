public class Mobile {
    private String name;

    public void setName(String name1) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void suyh(){
        System.out.println(name);
    }

    static void main() {
        Mobile m1 = new Mobile();

        m1.suyh();

    }
 }

