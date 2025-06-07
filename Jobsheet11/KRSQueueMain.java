package Jobsheet11;

import java.util.Scanner;
public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(10);
        int approvedStudent = 0;
        int choice;
        do {
            System.out.println("\n=== Student Course Registration Forms Approval ===");  
            System.out.println("1. Add student");
            System.out.println("2. Approve student");
            System.out.println("3. Show all student");
            System.out.println("4. Show the first two students");
            System.out.println("5. Show the last students");
            System.out.println("6. Print the total number of students");
            System.out.println("7. Show the total number of approved students");
            System.out.println("8. Clear");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (approvedStudent + queue.size >= 30) {
                        System.out.println("Cannot add more students. DPA can only approve up to 30 students");
                    } else {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Study Program: ");
                        String studyProgram = sc.nextLine();
                        System.out.print("Class name: ");
                        String className = sc.nextLine();

                        Student std = new Student(nim, name, studyProgram, className);
                        queue.enqueue(std);
                        System.out.println("Succefully added!!");
                    }
                    break;
                case 2:
                    System.out.println("Processing KRS Approval (2 students)");
                    for (int i = 0; i < 2; i++) {
                        Student processed = queue.dequeue();
                        if (processed != null) {
                            System.out.println("Student approved:");
                            processed.print();
                            approvedStudent++;
                        } else {
                            break;
                        }
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("First 2 students in queue:");
                    for (int i = 0; i < 2 && i < queue.size; i++) {
                        int index = (queue.front + i) % queue.max;
                        queue.data[index].print();
                    }
                    break;
                case 5:
                    System.out.println("Last student in queue:");
                    queue.viewRear();
                    break;
                case 6:
                    System.out.println("Total students in queue: " + queue.size);
                    break;
                case 7:
                    System.out.println("Approved students: " + approvedStudent);
                    System.out.println("Remaining quota for approval: " + (30 - approvedStudent));
                    break;
                case 8:
                    queue.clear();
                    approvedStudent = 0;
                    break;
                case 0:
                    System.out.println("Exiting program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }
}
