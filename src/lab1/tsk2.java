package lab1;

enum AccountType {
    DEBIT,
    CREDIT,
    SAVINGS
}

class BankAccount {

    public static int totalAccounts = 0;
    public static final String BANK_NAME = "kbtu bank";

    private final int id;

    private String owner;
    private double balance;
    private AccountType type;

    {
        System.out.println("Create a new bank account...");
    }

    public BankAccount(String owner, double balance, AccountType type) {
        this.id = ++totalAccounts;
        this.owner = owner;
        this.balance = balance;
        this.type = type;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void showInfo(){
        System.out.println("Bank: " + BANK_NAME);
        System.out.println("ID: " + id);
        System.out.println("Owner: " + owner);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

}

public class tsk2 {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Asyl", 2026,AccountType.DEBIT);
        BankAccount a2 = new BankAccount("Beka", 100, AccountType.SAVINGS);

        a1.deposit(350);
        a1.deposit(150);
        a2.deposit(100);

        a1.showInfo();
        a2.showInfo();

        System.out.println("Total accounts created: " + BankAccount.totalAccounts);
    }
}
