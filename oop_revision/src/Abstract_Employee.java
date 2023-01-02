enum Gender{male,female};
public abstract class Abstract_Employee {
      String name;
    Gender six;
      int SSN;
      String Address;
      Abstract_Employee(String name, Gender x,int SSN , String address)
      {
          this.name=name;
          this.Address=address;
          this.SSN=SSN;
          this.Address=address;
          six=x;
      }
    public    void setName(String name){
        this.name=name;
    }
    public    String getName(){
        return  name;
    }
    public   void setSSN(int SSN){
        this.SSN=SSN;
    }
    public    int getSSN(){
        return  SSN;
    }

    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public  String getAddress()
    {
        return  Address;
    }
     public  abstract double Earning();
      public String toString()
      {

          return "Name :" + name +" , address : "+Address +" , SSN = "+SSN +" , SEX = "+ six;
      }
}
