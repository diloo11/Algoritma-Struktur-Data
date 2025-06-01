package Jobsheet10;
import java.util.Scanner;

public class StudentDemo09 {
    public static void main(String[] args) {
        StudentAssignmentStack09 stack = new StudentAssignmentStack09(5);
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Collect Assignments");
            System.out.println("2. Assignments Grade");
            System.out.println("3. Display Top Assignment");
            System.out.println("4. Display Assignment List");
            System.out.print("Pilih: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Name: ");
                    String name = scan.nextLine();
                    System.out.println("NIM: ");
                    String nim = scan.nextLine();
                    System.out.println("Class: ");
                    String Class = scan.nextLine();
                    Student09 std = new Student09(name, nim, Class);
                case 2:
                    Student09 graded = stack.pop();
                    if (graded !=null) {
                        System.out.println("Grade Assignments from " + graded.name);
                        System.out.println("Input Grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment Grade %s is %d\n", graded.name, grade);
                    }
                    break;
                case 3:
                    Student09 peek = stack.peek();
                    if (peek != null) {
                        System.out.println("Last Assignment Collected by " + peek.name);
                    }
                    break;
                case 4:
                    System.out.println("List All Assignments");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice >= 1 && choice <=4);
    }
}
