//package Github;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        String[] tasks = new String[10];
        int taskCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete a task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (taskCount < tasks.length) {
                    System.out.print("Enter a new task: ");
                    tasks[taskCount] = scanner.nextLine();
                    taskCount++;
                    System.out.println("Task added successfully.");
                } else {
                    System.out.println("Your to-do list is full! You can't add more tasks.");
                }
            } else if (choice == 2) {
                if (taskCount == 0) {
                    System.out.println("Your to-do list is empty.");
                } else {
                    System.out.println("Your tasks:");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.println((i + 1) + ". " + tasks[i]);
                    }
                }
            } else if (choice == 3) {
                if (taskCount == 0) {
                    System.out.println("Your to-do list is empty, nothing to delete.");
                } else {
                    System.out.print("Enter the task number to delete (1-" + taskCount + "): ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= taskCount) {
                        for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                        }
                        tasks[taskCount - 1] = null;
                        taskCount--;
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number. Please try again.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option! Please choose a valid option (1-4).");
            }
        }

        scanner.close();
    }
}
