public class BasePlusCommission_Employee extends  Commission_Employee {
    double Base;

    BasePlusCommission_Employee(String name, Gender x, int SSN, String address, double gross_Sales, double common_rate, double base) {
        super(name, x, SSN, address, gross_Sales, common_rate);
        this.Base = base;
    }
    public  void setBase(double base)
    {
        this.Base=base;
    }
    public  double getBase ()
    {
        return  Base;
    }
    public  double Earnings()
    {
        return  Base+super.Earning();
    }
    public void display_all_details() {
        super.display_all_details();
    }

    @Override
    public void displayEarning() {
        System.out.println(Earning());
    }
}

