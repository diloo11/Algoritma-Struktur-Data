package CopyOfGroupTask;

public class Course{
    String courseCode;
    String courseName;
    int sks;

    public Course (String courseCode, String courseName, int sks) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.sks = sks;
    }

    public void displayCourse() {
        System.out.println("Course Code:\t" + courseCode + "\t|\tCourse Name:" + courseName + "\t|\tSKS: " + sks);
    }

    
}
