class Calculator {
   void summ(int x, int y) {
//       return (x + y);
      System.out.println(x+y);
   }
    void diff(int a, int b){
//        return ( a- b);
           System.out.println(a-b);
    }


    public static void main(String[] args) {


        Calculator c1 = new Calculator();

        c1.summ(140, 120);
        c1.diff(140, 120);

    }}
