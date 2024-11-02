import java.util.Scanner;

public class Bank {
    private String accountHolder;
    private double balance;
    private String password; // Private password field

    // Constructor
    public Bank(String accountHolder, String password) {
        this.accountHolder = accountHolder;
        this.password = password;
        this.balance = 0.0;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for password
    public void setPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password updated successfully.");
    }

    // Getter for balance (optional)
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Display balance method
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to verify password
    public boolean verifyPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account holder name:");
        String name = scanner.nextLine();

        System.out.println("Set a password:");
        String password = scanner.nextLine();

        Bank myBank = new Bank(name, password);

        boolean running = true;

        while (running) {
            System.out.println("\nOptions: 1) Deposit 2) Withdraw 3) Check Balance 4) Change Password 5) Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    myBank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    myBank.withdraw(withdrawAmount);
                    break;
                case 3:
                    myBank.displayBalance();
                    break;
                case 4:
                    System.out.println("Enter current password to change:");
                    String currentPassword = scanner.next();
                    if (myBank.verifyPassword(currentPassword)) {
                        System.out.println("Enter new password:");
                        String newPassword = scanner.next();
                        myBank.setPassword(newPassword);
                    } else {
                        System.out.println("Incorrect password.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
