public class Section {

    int sectionNumber;
    int capacity;
    int size;
    String status;
    Faculty instructor;
    Student[] students;

    public Section(int sectionNumber, int capacity, Faculty instructor) {
        this.sectionNumber = sectionNumber;
        this.capacity = capacity;
        this.instructor = instructor;
        this.status = "Open";
        this.students = new Student[capacity];
        size = 0;
    }


    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public Faculty getInstructor() {
        return instructor;  
    }

    public String getStatus() {
        return status;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) throws Exception {
        if (size < capacity) {
            students[size] = student;
            size++;
        }
        else {
            status = "Full";
            throw new Exception("Section is full");
        }
    }

    @Override
    public String toString() {
        return "Section: " + sectionNumber + ", Capacity: " + capacity + ", Status: " + status + ", Instructor: " + instructor.getName();
    }


    

    

}
