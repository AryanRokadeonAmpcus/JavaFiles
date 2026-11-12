package inheritance.ex;

import java.util.Scanner;

class Person {
  String name = "Ashoutosh";

}
class Student extends Person{
 int rollno = 21;
    void display(){
        System.out.println("Name of Student : "+name);
        System.out.println("Roll number of Student : "+rollno);

    }

    public static void main(String[] args) {

            Student s1 = new Student();

            s1.display();
    }
}