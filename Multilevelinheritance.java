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
class c extends b{//multilevel inheritance
public void r1(){
    System.out.println("hello professors");
}
}
public class Multilevelinheritance{
    public static void main(String[]args){
        c f=new c();
        f.pl();
        f.r();
        f.r1();
    }
}