package encapsulation.ex1;

import java.util.Scanner;

public class EmpClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Employee em1 = new Employee();
          Employee em2 = new Employee();
        System.out.print("Employee name is : ");
            em1.setEmpid(sc.nextLine());
        System.out.print("The salaray is : ");
            em1.setEmpsalary(sc.nextInt());

            sc.nextLine();

        System.out.print("Employee name is : ");
            em2.setEmpid(sc.nextLine());
        System.out.print("The salaray is : ");
            em2.setEmpsalary(sc.nextInt());


        System.out.println(em1.getEmpid());
        System.out.println(em1.getEmpsalary());

        System.out.println(em2.getEmpid());
        System.out.println(em2.getEmpsalary());
            sc.close();
        }
    }