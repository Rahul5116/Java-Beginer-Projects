package Github;

import java.util.Scanner;

public class StudentMarksSystem {
    public static void main(String[] args) {
        int[] marks = new int[10];
        int marksCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Marks System Menu:");
            System.out.println("1. Add marks");
            System.out.println("2. View all marks and grades");
            System.out.println("3. Calculate average marks and grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                if (marksCount < marks.length) {
                    System.out.print("Enter the marks (0-100): ");
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[marksCount] = mark;
                        marksCount++;
                        System.out.println("Marks added successfully.");
                    } else {
                        System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                    }
                } else {
                    System.out.println("Marks list is full! You can't add more marks.");
                }
            } else if (choice == 2) {
                if (marksCount == 0) {
                    System.out.println("No marks have been entered yet.");
                } else {
                    System.out.println("Marks and Grades:");
                    for (int i = 0; i < marksCount; i++) {
                        System.out.println("Marks " + (i + 1) + ": " + marks[i] + " - Grade: " + getGrade(marks[i]));
                    }
                }
            } else if (choice == 3) {
                if (marksCount == 0) {
                    System.out.println("No marks to calculate the average.");
                } else {
                    int sum = 0;
                    for (int i = 0; i < marksCount; i++) {
                        sum += marks[i];
                    }
                    double average = (double) sum / marksCount;
                    System.out.println("Average marks: " + average + " - Average Grade: " + getGrade((int) average));
                }
            } else if (choice == 4) {
                System.out.println("Exiting the Student Marks System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Please choose a valid option (1-4).");
            }
        }

        scanner.close();
    }

    private static String getGrade(int marks) {
        if (marks >= 92) {
            return "A+";
        } else if (marks >= 84) {
            return "A";
        } else if (marks >= 76) {
            return "B+";
        } else if (marks >= 69) {
            return "B";
        } else if (marks >= 59) {
            return "C+";
        } else if (marks >= 52) {
            return "C";
        } else if (marks >= 43) {
            return "D+";
        } else if (marks >= 35) {
            return "D";
        } else {
            return "Fail";
        }
    }
}
