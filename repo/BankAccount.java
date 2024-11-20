public class BankAccount {

    private double balance;
    private String[] recentTransactions;
    private int transactionIndex;

    public BankAccount() {
        this.balance = 0;
        this.recentTransactions = new String[3];
        this.transactionIndex = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposit: PLN " + amount);
        } else {
            System.out.println("Invalid number");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance && amount <= 500) {
                balance -= amount;
                addTransaction("Withdraw: PLN " + amount);
            } else {
                System.out.println("U r not able to do it.");
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: PLN " + balance);
    }

    private void addTransaction(String transaction) {
        recentTransactions[transactionIndex] = transaction;
        transactionIndex = (transactionIndex + 1) % 3;
    }

    public void displayRecentTransactions() {
        System.out.println("Recent Transactions:");
        for (int i = 0; i < 3; i++) {
            int index = (transactionIndex + i) % 3;
            if (recentTransactions[index] != null) {
                System.out.println(recentTransactions[index]);
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(500);
        b.displayBalance();
        b.deposit(200);
        b.displayBalance();
        b.withdraw(300);
        b.displayBalance();
        b.deposit(1000);
        b.withdraw(501);
        b.displayBalance();

        b.displayRecentTransactions();
    }
}
