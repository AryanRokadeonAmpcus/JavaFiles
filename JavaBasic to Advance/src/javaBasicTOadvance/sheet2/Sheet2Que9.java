package javaBasicTOadvance.sheet2;

public class Sheet2Que9 {
    public static void main(String[] args) {
        double sl = 12000.00;
        
        if(sl <= 10000 ){
            System.out.println(sl+": The income is low");
        } else if (sl <= 30000) {
            System.out.println(sl+": The income is low middle");
        } else if (sl <= 70000) {
            System.out.println(sl+": The income is high middle");
        }else if (sl >= 100000) {
            System.out.println(sl+": The income is high");
        }else
            System.out.println("your a broke person");
    }
}
