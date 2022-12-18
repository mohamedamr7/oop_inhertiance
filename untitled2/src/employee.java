 class employee extends  User {
    int salary;
    int Rank;
    String job;
    employee(String first_name, String last_name, String address,int salary , int rank, String job)
    {
        super(first_name,last_name,address);
        this.salary=salary;
        this.Rank=rank;
        this.job=job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRank(int Rank) {
        this.Rank = Rank;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public int getRank() {
        return Rank;
    }

    public String getJob() {
        return job;
    }


}
