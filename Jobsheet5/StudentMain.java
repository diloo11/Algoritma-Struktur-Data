package Jobsheet5;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ahmad", "220101001", 2022, 78, 82),
            new Student("Budi", "220101002", 2022, 85, 88),
            new Student("Cindy", "22101003", 2021, 90, 87),
            new Student("Dian", "220101004", 2021, 76, 79),
            new Student("Eko", "220101005", 2023, 92, 95),
            new Student("Fajar", "220101006", 2020, 88, 85),
            new Student("Gina", "220101007", 2023, 80, 83),
            new Student("Hadi", "220101008", 2020, 82, 84)
        };
        
        int topMidterm = Student.highestMidterm(students, 0, students.length - 1);
        int bottomMidterm = Student.lowestMidterm(students, 0, students.length - 1);
        double avrFinal = Student.averageFinal(students);

        System.out.println("Student with highest midterm score: ");
        students[topMidterm].printTable();
        System.out.println();
        System.out.println("Student with lowest midterm score: ");
        students[bottomMidterm].printTable();
        System.out.println();
        System.out.printf("Average final score students: %.2f\n ", avrFinal);


    }
}