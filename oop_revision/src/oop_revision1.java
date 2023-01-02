import  java.util.Scanner;
import  java.util.ArrayList;
public class oop_revision1 {
   public  static  void main(String[]args)
   {
       Department d1=new Department(1,"mohamed amr");
      Salaried_Employee s1=new Salaried_Employee("ahemd",Gender.male,554, "zifta",1321,232,123);
     d1.add_employee(s1);

   }

}
