import java.util.*;
public class Creatingnewexceptionusingmethod{
   public static void a(int a,int b){
        if(b==0)
        {
            throw new ArithmeticException("cannot divide");
        }
        System.out.println(a/b);
    }
    public static void main(String[]args){
        try{
            a(10,0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

}