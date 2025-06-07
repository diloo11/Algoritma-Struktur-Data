package Jobsheet5;

public class Student {
    String name;
    String studentID;
    int yearAdmission;
    int uts;
    int uas;

    Student(String name, String id, int year, int uts, int uas){
        this.name = name;
        this.studentID = id;
        this.yearAdmission = year;
        this.uts = uts;
        this.uas = uas;
    }

    void printTable(){
        System.out.printf("%-7s %-13s %-19s %-15s %-15s\n", "Name", "Student ID", "Year of Admission", "Midterm Score", "Final Score");
        System.out.printf("%-7s %-13s %-19s %-15d %-15d\n", this.name, this.studentID, this.yearAdmission, this.uts, this.uas);
    }

    static int highestMidterm(Student[] students, int left, int right){
        if (left == right) {
            return left;
        }

        int mid = (left + right) / 2;
        int leftHigh = highestMidterm(students, left, mid);
        int rightHigh = highestMidterm(students, mid + 1, right);
        
        return (students[leftHigh].uts >= students[rightHigh].uts) ? leftHigh : rightHigh;
    }

    static int lowestMidterm(Student[] students, int left, int right){
        if (left == right) {
            return left;
        }

        int mid = (left + right) / 2;
        int leftLow = lowestMidterm(students, left, mid);
        int rightLow = lowestMidterm(students, mid + 1, right);
        return (students[leftLow].uts >= students[rightLow].uts) ? rightLow : leftLow;
    }

    static double averageFinal(Student[] students){
        int total = 0;
        for (Student student : students) {
            total += student.uas;
        }
        return (double) total / students.length;
    }

}
