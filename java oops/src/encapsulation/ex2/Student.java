package encapsulation.ex2;

import java.util.Scanner;

public class Student {
    private String name;
    private int marks;

   public void setName(String name){
        this.name = name;
    }
    public void setMarks(int marks){
        if(marks >= 35 && marks <=100 ){
            this.marks = marks;
        }else
            System.out.println("INVALID MARKS");
    }
    public String getName(){
       return name;
    }
    public int getMarks(){
       return marks;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.setName(sc.nextLine());
        s1.setMarks(sc.nextInt());
        sc.nextLine();
        s2.setName(sc.nextLine());
        s2.setMarks(sc.nextInt());
        System.out.println("The name of Student is : "+s1.getName());
        System.out.println("Marks of student : "+s1.getMarks());

        System.out.println("The name of Student is : "+s2.getName());
        System.out.println("Marks of student : "+s2.getMarks());

        sc.close();
   }
}
