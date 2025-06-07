package Jobsheet12;

public class Student {
    String nim, name, className;
    double gpa;

    public Student(String nim, String name, String className, double gpa) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }
}
