class Main {

    public static void main(String[] args) {

        Faculty fac1 = new Faculty("John", 30, "555-1434", 50000, "10:00-18:00", "Computer Science");

        Section sec1 = new Section(1, 7, fac1);

        Faculty fac2 = new Faculty("Jane", 28, "555-7890", 60000, "10:00-18:00", "Mathematics and Science");

        Section sec2 = new Section(2, 5, fac2);

        System.out.println("Before adding students" );
    
        System.out.println(sec1.toString() + "\n");

        

        Student student1 = new Student("Alice", 20, "555-1234", "S001", "Computer Science", 3.8f);
        Student student2 = new Student("Bob", 21, "555-5678", "S002", "Mathematics", 3.5f);
        Student student3 = new Student("Charlie", 22, "555-8765", "S003", "Physics", 3.9f);
        Student student4 = new Student("Dana", 19, "555-4321", "S004", "Chemistry", 3.2f);
        Student student5 = new Student("Eve", 23, "555-3456", "S005", "Biology", 3.6f);
        Student student6 = new Student("Frank", 20, "555-6543", "S006", "History", 3.4f);
        Student student7 = new Student("Grace", 21, "555-7890", "S007", "Literature", 3.7f);
        Student student8 = new Student("Hank", 22, "555-0987", "S008", "Philosophy", 3.1f);
        Student student9 = new Student("Ivy", 19, "555-1230", "S009", "Economics", 3.3f);
        Student student10 = new Student("Jack", 24, "555-4567", "S010", "Engineering", 3.0f);


        Student[] studentsToAdd = {
            student1, student2, student3, student4, student5,
            student6, student7, student8, student9, student10
        };

        

        try {


            for (int i =0; i<studentsToAdd.length;i++) {
                sec1.addStudent(studentsToAdd[i]);
                studentsToAdd[i] = null;
            }


            }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage() + "\n" + "Open New Section"+ "\n");
        }


        try {

            for (int i =0; i<studentsToAdd.length;i++) {
                if (studentsToAdd[i] != null) {
                    sec2.addStudent(studentsToAdd[i]);
                    studentsToAdd[i] = null;
                }
            }
        }
        catch(Exception e){
        }
        


        System.out.println("After adding students" );
        
        System.out.println(sec1.toString());
        System.out.println(sec2.toString() + "\n");

        System.out.println("Section 1 students:");
        for (Student student : sec1.getStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("\nSection 2 students:");
        for (Student student : sec2.getStudents()) {
            if(student != null)
                System.out.println(student.getName());
        }


        
    }

}