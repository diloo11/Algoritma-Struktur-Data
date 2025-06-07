package Jobsheet10;

import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentAssignmentStack stack = new StudentAssignmentStack(5);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Assignment Submission");
            System.out.println("2. Grade assignment");
            System.out.println("3. View top assignment");
            System.out.println("4. View assignment list");
            System.out.println("5. View first student assignment");
            System.out.println("6. Total assignments submitted");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();
                    Student std = new Student(name, nim, className);
                    stack.push(std);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", std.name);
                    break;
                
                case 2:
                    Student graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Graded assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = sc.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;
                
                case 3:
                    Student see = stack.peek();
                    if (see != null) {
                        System.out.println("The last assignment comes from " + see.name);
                    }
                    break;
                
                case 4:
                    System.out.println("Assignment list");
                    System.out.println("Name\tNIM\tClass Name");
                    stack.print();
                    break;
                
                case 5:
                    Student first = stack.getFirsAssignment();
                    if (first != null) {
                        System.out.println("First submitted assignment comes from " + first.name);
                    }
                    break;

                case 6:
                    int count = stack.totAssignment();
                    System.out.println("Total assignment submitted: " + count);
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice >= 1 && choice <= 6);

    }
}
