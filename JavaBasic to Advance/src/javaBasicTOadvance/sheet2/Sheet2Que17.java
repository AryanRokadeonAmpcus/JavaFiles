package javaBasicTOadvance.sheet2;

public class Sheet2Que17 {
    public static void main(String[] args) {

        int num = 235;
        System.out.println("Enter the Number");
        int count=0;
        if(num==0){
            System.out.println("You Have Entered zero");
        }else {
            if(num<0){
                num=num*-1;
            }
        }


        for(  ; num>0;){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
//                while (num>0){
//                    num=num/10;
//                    count++;
//                }
