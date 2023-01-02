public class Houly_Employee extends  Abstract_Employee implements  Display{
    double Houre_rate;
    int NUMBER_OF_HOUR;

    Houly_Employee(String name, Gender x, int SSN, String address, double houre_rate,
                   int NUMBER_OF_HOUR) {
        super(name, x, SSN, address);
        this.Houre_rate=houre_rate;
        this.NUMBER_OF_HOUR=NUMBER_OF_HOUR;
    }

    public  void setHoure_rate(double houre_rate)
    {
        this.Houre_rate=houre_rate;
    }

    public  void setNUMBER_OF_HOUR(int number_of_hour)
    {
        this.NUMBER_OF_HOUR=number_of_hour;
    }

    public  double getHoure_rate ()
    {
        return  Houre_rate;
    }

    public  int getNUMBER_OF_HOUR()
    {
        return  NUMBER_OF_HOUR;
    }
    @Override
    public double Earning() {
        return NUMBER_OF_HOUR*Houre_rate;
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
        return  "Houly_Employee { \n"+ " Houre_rate : "+ Houre_rate + " , Number of hour : "+ NUMBER_OF_HOUR + "}";
    }
}
