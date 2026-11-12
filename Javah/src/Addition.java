class Addition {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Demo {
    public static void main(String[] args) {

        Addition a = new Addition();

        System.out.println(a.sum(10, 20));
        System.out.println(a.sum(10, 20, 30));

    }
}