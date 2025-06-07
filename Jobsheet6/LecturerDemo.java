package Jobsheet6;

import java.util.Scanner;
public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData lecturersData = new LecturerData();

        lecturersData.add(new Lecturer("2501", "Imam", true, 32));
        lecturersData.add(new Lecturer("2502", "Afif", true, 28));
        lecturersData.add(new Lecturer("2503", "Atiqah", false, 30));
        lecturersData.add(new Lecturer("2504", "Bagas", true, 25));
        lecturersData.add(new Lecturer("2505", "Meyti", false, 35));
        lecturersData.add(new Lecturer("2506", "Dika", true, 34));
        lecturersData.add(new Lecturer("2507", "Anugrah", true, 22));
        lecturersData.add(new Lecturer("2508", "Farid", true, 33));
        lecturersData.add(new Lecturer("2509", "Devi", false, 26));
        lecturersData.add(new Lecturer("2510", "Vivi", false, 20));

        System.out.println("Original Lecturer List:");
        lecturersData.print();

        lecturersData.sortingAsc();
        System.out.println("Sorted lecturer list (by Age, ascending) using Bubble Sort");
        lecturersData.print();

        lecturersData.sortingDsc();
        System.out.println("Sorted lecturer list (by Age, descending) using Insertion Sort");
        lecturersData.print();

        System.out.println("---------------------------------");
        System.out.print("Search lecturer by name: ");
        String search = sc.nextLine();
        int position = lecturersData.findNameSeqSearch(search);
        lecturersData.showPositionAndData(search, position);

        System.out.print("Search lecturer by age: ");
        int findAge = sc.nextInt();
        lecturersData.sortingAsc();
        int pos = lecturersData.findAgeBinarySearch(findAge, 0, lecturersData.idx - 1);
        lecturersData.showPositionAndData(String.valueOf(findAge), pos);
    }
}
