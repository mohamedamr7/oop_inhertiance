class User {
    public String first_name;
    public String last_name;
    public String address;


    User(String first_name, String last_name , String address)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
    }

     public User() {
     }

     public void setfirst_name(String first_name)
    {
        this.first_name=first_name;
    }
    public void setlast_name(String last_name)
    {
        this.last_name=last_name;
    }
    public void setadress(String address)
    {
        this.address=address;
    }
    public void set(String first_name)
    {
        this.first_name=first_name;
    }
    public String getfirst_name(String f)
    {
        return f;
    }
    public String getlast_name(String l)
    {
        return l;
    }
    public String getaddress(String a)
    {
        return a;
    }

}






