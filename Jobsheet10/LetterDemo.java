package Jobsheet10;

import java.util.Scanner;
public class LetterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExcuseLetterStack stack = new ExcuseLetterStack(10);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Lastest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();
                    System.out.print("Type of excuse (S:sick, I:other reasons): ");
                    char type = sc.next().charAt(0);
                    System.out.print("Duration: ");
                    int duration = sc.nextInt();

                    ExcuseLetter09 ltr = new ExcuseLetter09(id, name, className, type, duration);
                    stack.push(ltr);
                    System.out.printf("%s's letter has been successfully submitted\n", ltr.name);
                    break;
                
                case 2:
                    ExcuseLetter09 verified = stack.pop();
                    if (verified != null) {
                        System.out.println("Verified letter from " + verified.name);
                        System.out.print("Accept (y/n)? ");
                        String accept = sc.nextLine();
                        if (accept.equalsIgnoreCase("y")) {
                            System.out.printf("%s's excuse letter accepted\n", verified.name);
                        } else {
                            System.out.printf("%s's excuse letter not accepted\n", verified.name);

                        }
                    }
                    break;

                case 3:
                    ExcuseLetter09 see = stack.peek();
                    if (see != null) {
                        System.out.println("The last excuse letter comes from " + see.name);
                    }
                    break;

                case 4:
                    System.out.print("Name: ");
                    String searchName = sc.nextLine();
                    ExcuseLetter09 searched = stack.searchLetter(searchName);
                    if (searched != null) {
                        System.out.println("Name: " + searched.name + ", ID: " + searched.id + ", Class: " + searched.className + ", Type of excuse: " + searched.typeOfExcuse + ", Duration: " + searched.duration);
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice >= 1 && choice <= 4);
    }
}
