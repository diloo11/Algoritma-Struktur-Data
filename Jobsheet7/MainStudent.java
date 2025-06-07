package Jobsheet7;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int amountStudent = s.nextInt();

        SearchStudent data = new SearchStudent();
        data.listStd = new Students[amountStudent];

        System.out.println("--------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("---------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            System.out.print("Name\t:");
            String name = sl.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("--------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("__________________________");
        System.out.println("__________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("--------------------------");
        System.out.print("Search student by NIM: ");
        System.out.println("Using Binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent-1);

        data.showPosition(search, position1);
        data.showData(search, position1);
    }
}
