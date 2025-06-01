package Jobsheet10;

public class Student09 {
    String nim;
    String name;
    String className;
    int grade;

    Student09 (String name, String nim, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading (int grade) {
        this.grade = grade;
    }
}
