import java.util.*;
class a{  // a is parent class
public void pl()
{
    System.out.println("hello students");
}
}
class b extends a{//b is the child or subclass
public void r(){
    System.out.println("hello teachers");
}
}
class c extends a{
public void r1(){
    System.out.println("hello professors");
}
}
public class Hierarchicalinheritance{
    public static void main(String[]args){
        b h=new b();
        h.r();
        h.pl();
        c h1=new c();
        h1.pl();
        h1.r1();
    }
}