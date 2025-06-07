package Jobsheet10;

public class Student {
    String nim, name, className;
    int grade;

    Student(String name, String nim, String className){
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade){
        this.grade = grade;
    }
}
