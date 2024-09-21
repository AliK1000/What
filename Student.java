public class Student extends Person {

    String studentID;
    String major;
    float gpa;


    public Student(String name, int age, String phoneNumber, String studentID, String major, float gpa) {
        super(name, age, phoneNumber);
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }   

    public String getMajor() {
        return major;
    }

    public float getGpa() {
        return gpa;
    }  

}
