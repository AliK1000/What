public class Faculty extends Person {

    int salary;
    String officeLocation;
    String officeHours;
    String department;
    


    public Faculty(String name, int age, String phoneNumber, int salary, String officeHours , String department) {
        super(name, age, phoneNumber);
        this.salary = salary;
        this.officeHours = officeHours;
        this.department = department;
    }


    public int getSalary() {
        return salary;
    }


    public String getOfficeLocation() { 
        return officeLocation;
    }


    public String getOfficeHours() {
        return officeHours;
    }   


    public String getDepartment() { 
        return department;
    }

    
}
