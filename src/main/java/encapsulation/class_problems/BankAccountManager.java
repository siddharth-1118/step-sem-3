package encapsulation.class_problems;

public class BankAccountManager {

    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                this.balance = 0.0;
            } else {
                this.balance = initialBalance;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Withdrawal failed: Invalid amount or insufficient funds");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}
