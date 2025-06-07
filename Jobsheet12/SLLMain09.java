package Jobsheet12;

import java.util.Scanner;
public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList09 sll = new SingleLinkedList09();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Student #" + (i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String className = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();

            Student09 std = new Student09(nim, name, className, gpa);
            sll.addLast(std);
        }

        Student09 std1 = new Student09("001", "Student 1", "TI-1I", 3.89);
        Student09 std2 = new Student09("002", "Student 2", "TI-1I", 3.45);
        Student09 std3 = new Student09("003", "Student 3", "TI-1I", 3.20);
        Student09 std4 = new Student09("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("Data at index 1 is:");
        Student09 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
