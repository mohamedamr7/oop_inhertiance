public class person {
   public int age;
    private String name;
    private String address;
   public person(int age,String name, String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public  void setName(String name)
    {
        this.name=name;

    }
    public  void setAddress(String Address)
    {
        address=Address;

    }
    public  void setAge(int age)
    {
        this.age=age;

    }
    public String getName()
    {
        return  name;
    }
public  String getAddress (){
       return  address;
}
public  int getAge ()
{
    return  age;
}

}
class  matter extends  person{
    public matter(int age, String name, String address) {
        super(age, name, address);
    }
}
