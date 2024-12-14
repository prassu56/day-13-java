import java.util.*;
class a{  
public void r()
{
    System.out.println("hell0");
}
}
class b extends a{
    public void r1()
    {
     super.r();
    System.out.println("hello teachers");
}
}
public class Super{
    public static void main(String[]args){
      b n=new b();
      n.r1();
    }
}    