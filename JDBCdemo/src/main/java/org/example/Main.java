package org.example;
import java.sql.SQLException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws SQLException {

            Scanner scan = new Scanner(System.in);
            int choice;

            StudentDAO sd = new StudentDAO();

            do {
                System.out.println("\n1: Insert");
                System.out.println("2: Delete");
                System.out.println("3: Find");
                System.out.println("4: Find All");
                System.out.println("0: Exit");
                System.out.print("Enter your option: ");

                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scan.next();

                        System.out.print("Enter gender: ");
                        String gender = scan.next();

                        System.out.print("Enter reg no: ");
                        int regno = scan.nextInt();

                        System.out.print("Enter email: ");
                        String email = scan.next();

                        System.out.print("Enter DOB (yyyy-mm-dd): ");
                        String dob = scan.next();

                        Student stu = new Student(name, gender, regno, email, dob);
                        sd.insert(stu);
                        break;

                    case 2:
                        System.out.print("Enter reg no to delete: ");
                        int id = scan.nextInt();
                        sd.delete(id);
                        break;

                    case 3:
                        System.out.print("Enter reg no to find: ");
                        int r = scan.nextInt();
                        sd.find(r);
                        break;

                    case 4:
                        sd.findAll();
                        break;

                    case 0:
                        System.out.println("Exited");
                        break;

                    default:
                        System.out.println("Invalid option");
                }

            } while (choice != 0);
        }
    }

