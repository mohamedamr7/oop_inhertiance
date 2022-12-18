public class Salaried_Employee extends  employee {
    double bonus;
    double deucation;

    Salaried_Employee(String first_name, String last_name, String address, int salary, int rank, String job, double bonus, double deucation) {
        super(first_name, last_name, address, salary, rank, job);
        this.bonus = bonus;
        this.deucation = deucation;
    }
    public double getSalary()
    {
        return  (salary+bonus-deucation);
    }
  public void print()
  {
      System.out.println("mohamed ");
  }
}


