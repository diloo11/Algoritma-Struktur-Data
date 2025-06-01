package CopyOfGroupTask;


import java.util.Scanner;
public class presentionMain {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AbsenceData data = new AbsenceData();
        while (true) {
            System.out.println("Welcome to SIAKAD!");
            System.out.println("========== MENU ==========");
            System.out.println("1. Display Student Data");
            System.out.println("2. Display Course Data");
            System.out.println("3. Display Student Data");
            System.out.println("4. Sort Presention Data by Presention Percentage");
            System.out.println("5. Search Presention Data by NIM");
            System.out.println("6. Display Average Presention");
            System.out.println("0. Exit");
            System.out.print("Enter Valid Menu Number: ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("=== STUDENTS DATA ===");
                    for (Student s : data.stdArray) {
                        s.displayStudent();
                    }
                    break;
                case 2:
                    System.out.println("=== COURSE DATA ===");
                    for (Course c : data.crsArray) {
                        c.displayCourse();
                    }
                    break;
                case 3:
                    System.out.println("=== COURSE DATA ===");
                    for (Absence a : data.listAbsence) {
                        a.displayAbsence();
                    }
                    break;
                case 4:
                    System.out.println("=== ABSENCE DATA BASED ON ATTENDANCE PERCENTAGE ===");
                    data.sortData();
                    data.sortedDisplay();
                    break;
                case 5:
                    System.out.print("Input: ");
                    String nim = sc.nextLine();
                    System.out.println("=== SEARCH ATTENDANCE DATA BY NIM ===");
                    data.searchNim(nim);
                    break;
                case 6:
                    System.out.println("=== AVERAGE ATTENDANCE ===");
                    data.averagePresention();
                    break;
                case 0:
                System.out.println("Exiting Program");
                    return;
                default:
                System.out.println("Invalid Choice. Please try again");
                    break;
            }
        }
    }
}

