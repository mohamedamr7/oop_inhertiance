import  java.util.Scanner;
class A2 {
   public  static  void main(String[]args)
   {
       Scanner input=new Scanner(System.in);
       String n1="mohamed";
       String n2="mohamed";
       System.out.println(n1.compareTo(n2));
       System.out.println(n1.equals(n2));

       double x= input.nextDouble();
       System.out.println(  Math.floor(x) );
       System.out.println( Math.abs(x));
       System.out.println( Math.ceil(x));
       System.out.println(Math.rint(x));
       System.out.println((int) (Math.random() * 20));
       System.out.println(Math.sqrt(25));
       System.out.println(Math.round(x));
       System.out.println(Math.exp(x));
       System.out.println(Math.expm1(x));
       System.out.println(Math.pow(3,2));


   }
}