package codesoft;
import java.util.Scanner;

class Banking{
    private double balance;

    public Banking(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false; // Insufficient balance
    }
}

class ATM {
    private Banking account;

    public ATM(Banking account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            System.out.print("Select an option (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: Rs");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposited rs" + depositAmount + " successfully.");
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: Rs");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn Rs" + withdrawAmount + " successfully.");
                    } else {
                        System.out.println("Insufficient balance for withdrawal.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Have a nice day!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
            }
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        Banking userAccount = new Banking(1000);

        // Initialize the ATM with the user's account
        ATM atm = new ATM(userAccount);

        // Start the ATM application
        atm.run();
    }
}