class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrollmentStudetns;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrollmentStudetns = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudents(String StudentName){
        enrollmentStudetns[enrollments] = StudentName;
        enrollments++;
    }

    void unenrollStudents(String StudentName){
        System.out.println("Student Removed");
        enrollments--;
    }

    public static void main(String[] args) {
        
    }
}
