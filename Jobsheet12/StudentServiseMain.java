package Jobsheet12;

import java.util.Scanner;
public class StudentServiseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue();

        while (true) {
            System.out.println("\nStudent Service Queue System");
            System.out.println("1. Register Student");
            System.out.println("2. Serve Next Student");
            System.out.println("3. View Front Student");
            System.out.println("4. View Rear Student");
            System.out.println("5. Total Number of Students");
            System.out.println("6. Clear Queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full. Cannot register more students");
                        break;
                    }
                    System.out.println("\nEnter Student Details:");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine();

                    Student newStudent = new Student(nim, name, className, gpa);
                    queue.enqueue(newStudent);
                    break;
                    
                case 2:
                    Student servedStudent = queue.dequeue();
                    if (servedStudent != null) {
                        System.out.println("\nNow serving:");
                        servedStudent.display();
                    }
                    break;
                
                case 3:
                    Student fronStudent = queue.peekFront();
                    if (fronStudent != null) {
                        System.out.println("\nFront student in queue:");
                        fronStudent.display();
                    } else {
                        System.out.println("Queue is empty!!");
                    }
                    break;
                
                case 4:
                    Student rearStudent = queue.peekRear();
                    if (rearStudent != null) {
                        System.out.println("\nLast student in queue");
                        rearStudent.display();
                    } else {
                        System.out.println("Queue is empty!!");
                    }
                    break;

                case 5:
                    System.out.println("Total students in queue: " + queue.size);
                    queue.displayQueue();
                    break;

                case 6:
                    queue.clear();
                    break;
                
                case 7:
                    System.out.println("Exiting system...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!!");
                    break;
            }
        }
    }
}
