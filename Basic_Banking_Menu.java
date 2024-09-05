//package Github;

import java.util.Scanner;

public class banking_system {
    public static void main(String[] args) {
        double balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nWelcome to Online Banking Services:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit ");
            System.out.println("Choose any option: (1-4): ");

            int choice = scanner.nextInt();

            if (choice == 1 ){
                System.out.println("Enter amount to be deposited: ");
                double deposit = scanner.nextDouble();
                if(deposit > 0){
                    balance += deposit ;
                    System.out.println("Deposit successful. Your new balance is : Rs."+balance);

                }else {
                    System.out.println("Invalid deposit amount. Please try again");
                }
            } else if (choice==2) {
                System.out.println("Enter amount to be withdrawn: ");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0){
                    balance -= withdraw;
                    System.out.println("Withdrawal successful !! Balance is : Rs."+balance);
                }else {
                    System.out.println("Invalid withdrawal amount or insufficient balance.");
                }

            } else if (choice == 3) {
                System.out.println("Your current balance is: Rs."+balance);
                
            } else if (choice == 4 ) {
                System.out.println("Thank you for using Onlince Banking Services! ");
                
            }
        }

//        scanner.close();

    }
}
