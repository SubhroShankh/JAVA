class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollements;
    String[] enrolledStudent;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollements = 0; 
        this.enrolledStudent = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
    
    void enrollStudent(String studentName){
        enrolledStudent[enrollements] = studentName;
        enrollements++; 
    }

    void unrollStudents(String studentName){
        System.out.println("Student removed");
        enrollements--;
    }

}