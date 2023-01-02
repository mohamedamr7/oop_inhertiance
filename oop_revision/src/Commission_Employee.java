public class Commission_Employee extends  Abstract_Employee implements  Display{

        double Gross_Sales;
        double Common_rate;

    Commission_Employee(String name, Gender x, int SSN, String address , double gross_Sales
    , double common_rate) {
        super(name, x, SSN, address);
        this.Gross_Sales=gross_Sales;
        this.Common_rate=common_rate;
    }


        public  void setGross_Sales(double gross_Sales)
    {
        this.Gross_Sales=gross_Sales;
    }
    public  void setCommon_rate(double common_rate)
    {
        this.Common_rate=common_rate;
    }
    public  double getGross_Sales()
    {
        return  Gross_Sales;
    }
    public  double getCommon_rate()
    {
        return  Common_rate;
    }
    public double Earning() {
        return Gross_Sales;
    }

    @Override
    public void display_all_details() {
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public void displayEarning() {
          System.out.println(Earning());
    }
    public  String toString()
    {
        return  "CommissionEmolyee {  \n"+ "Gross_Sales"+Gross_Sales +" ,Common_rate"+ Common_rate;
    }
}
