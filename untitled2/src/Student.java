public class Student extends  User{
    int study_level;
    String specialization;
    double Gpa;
    Student()
    {


    }
    Student(String first_name, String last_name, String address, int l , String s , double g) {
        super(first_name, last_name, address);
    study_level =l;
    specialization=s;
    Gpa=g;
    }
    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGpa(double Gpa) {
        this.Gpa = Gpa;
    }

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGpa() {
        return Gpa;
    }

}

