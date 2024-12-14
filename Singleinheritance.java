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
public class Singleinheritance{
    public static void main(String[]args){
        a h=new a();
        h.pl();
        b y=new b();
        y.r();
    }
}