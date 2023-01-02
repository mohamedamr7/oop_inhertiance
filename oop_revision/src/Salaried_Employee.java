public class Salaried_Employee extends  Abstract_Employee implements  Display {
double salary;
double bonus;
double deductions;

    Salaried_Employee(String name, Gender x, int SSN, String address , double salary
    , double bonus , double deductions ) {
        super(name, x, SSN, address);
        this.deductions=deductions ;
        this.salary=salary;
        this.bonus=bonus;
    }
    public  void setSalary(double salary)
    {
        this.salary=salary;
    }
    public  void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    public  void setDeductions(double deductions)
    {
        this.deductions=deductions;
    }
    public  double  getSalary()
    {
        return  salary;
    }
    public  double  getBonus()
    {
        return  bonus;
    }
    public  double  getDeductions()
    {
        return  deductions ;
    }

    @Override
    public double Earning() {
        return (salary+bonus)-deductions;
    }

    @Override
    public void display_all_details() {
    System.out.println(  super.toString());
    System.out.println(toString());
    }

    @Override
    public void displayEarning() {
        System.out.println(Earning());
    }
    public  String toString()
    {
        return  "Salaried_Employee { \n"+ " Salary " +salary +" , bonus : "+bonus+ " ,deduction : "+deductions;
    }
}
