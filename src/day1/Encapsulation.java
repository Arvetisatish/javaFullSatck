package day1;

class Account {
    // Private data members
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter method for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Create an Account object
        Account myAccount = new Account("John Doe", 1000.0);

        // Access account holder name using getter
        System.out.println("Account Holder: " + myAccount.getAccountHolderName());

        // Deposit money
        myAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        // Withdraw money
        myAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());

        // Trying to access private members directly (will cause an error)
        // myAccount.balance = 5000.0; // This line would cause a compilation error
    }
}
