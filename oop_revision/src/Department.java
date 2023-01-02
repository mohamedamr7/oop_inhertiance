import java.util.ArrayList;
import  java.util.Scanner;
public class Department {
       int  dno;
       String dname;
       ArrayList<Abstract_Employee> empList;
       public  Department(){}
    public  Department(int dno, String dname)
    {
        this.dname=dname;
        this.dno=dno;
        empList=new ArrayList<Abstract_Employee>();
    }
    public  void setDno(int dno)
    {
        this.dno=dno;
    }
    public  void setDname(String name)
    {
        this.dname=dname;
    }
    public String getDname()
    {
        return dname;
    }
    public  int getDno ()
    {
        return  dno;
    }
    public  void add_employee(Abstract_Employee e)
    {
        empList.add(e);
    }
    public  void remove_employee(int index)
    {
        empList.remove(index);
    }
    public int count_employee()
    {
        return  empList.size();
    }
    public  void print_basic_data()
    {
        for (int i=0; i<empList.size(); i++)
        {
            System.out.println(empList.get(i).getSSN() +" "+ empList.get(i).getName()+  empList.get(i).getAddress());
        }
    }
public  void print_All_details()
{
    for (int i=0; i<empList.size(); i++)
    {
        if (empList.get(i) instanceof Salaried_Employee)
        {
            ((Salaried_Employee)empList.get(i)).display_all_details();
        }
        if (empList.get(i) instanceof Houly_Employee)
        {
            ((Houly_Employee)empList.get(i)).display_all_details();
        }
        if (empList.get(i) instanceof Commission_Employee)
        {
            ((Commission_Employee)empList.get(i)).display_all_details();
        }
    }
}

}
