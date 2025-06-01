package CopyOfGroupTask;

public class Student {
    String nim;
    String studentName;
    
    public Student (String nim, String studentName) {
        this.nim = nim;
        this.studentName = studentName;
    }
    
    public void displayStudent() {
        System.out.println("NIM :\t" + nim + "\t|\t Name: " + studentName);
    }
    
}