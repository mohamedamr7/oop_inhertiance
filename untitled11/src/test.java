import  java.util.Scanner;
import java.util.ArrayList;
public class test {
    public  static  void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
       ArrayList<String> a=new ArrayList<String>();
       a.add("mohamed");
        a.add("ahmed");
        a.add("aya");
      System.out.println(a);
        a.remove(1);
        a.size();
        System.out.println(a);
        a.add(2,"amr");
      System.out.println(a);

     System.out.println( a.set(2,"ahmed"));
     System.out.println(a.get(2));




    }
}
