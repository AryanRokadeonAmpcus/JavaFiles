public class Books {
String Title;

Books(String t){
    Title = t;
}
void display(){
    System.out.println(Title +" Java programming");
}

public static void main() {
    Books b2 = new Books("Book : ");
    b2.display();
}
}
