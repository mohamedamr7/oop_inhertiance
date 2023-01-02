import  java.io.*;
import  java.util.*;

public class read_from_file {
   private  Scanner x;
   public  void openfile()
   {
       try {
           x=new Scanner(new File("Bank_question.txt"));
       }
       catch (Exception e)
       {
           System.out.println("could not find file");
       }
   }
   public  void readFile()
   {
       while (x.hasNext())
       {
           String a =x.next();
           String b= x.next();
           String c=x.next();
           System.out.printf("%s %s %s" , a,b,c);
       }
   }
   public  void closeFile()
   {
       x.close();
   }
}
