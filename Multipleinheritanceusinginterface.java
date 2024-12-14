import java.util.*;
interface a{ 
public void r();
}
interface b{
public void r1();
}
class c implements a,b{//multilevel inheritance
public void r(){
    System.out.println("hello teachers");
}
public void r1(){
    System.out.println("hello professors");
}
}
public class Multipleinheritanceusinginterface{
    public static void main(String[]args){
        c h1=new c();
        h1.r();
        h1.r1();
    }
}