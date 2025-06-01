package Jobsheet12;

public class Student09 {
    String nim, name, className;
    double gpa;

    public Student09() {
    }

    public Student09(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}