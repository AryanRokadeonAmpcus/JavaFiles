class Book {
   String title;
   String Author;
   int price;

class Main{
    static void main(String[]args) {

        Book b1 = new Book();
        Book b2 = new Book();


        b1.Author = "Sane Guruji";
        b1.price  = 350;
        b1.title  ="Shyamchi Aai";

        b2.Author = "Adolf Hitler";
        b2.price  = 600;
        b2.title  = "Mein Kmapf";

        System.out.println(b1.title);
        System.out.println(b1.Author);
        System.out.println(b1.price);
        System.out.println(" ");
        System.out.println(b1.title);
        System.out.println(b2.Author);
        System.out.println(b2.price);
    }
}
}