package bai8;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp thành công " + amount + " vào tài khoản " + accountNumber);
        } else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ để rút tiền!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Rút thành công " + amount + " từ tài khoản " + accountNumber);
        } else {
            System.out.println("Số tiền rút không hợp lệ!");
        }
    }

    public void transfer(BankAccount recipient, double amount) {
        if (amount > balance) {
            System.out.println("Số dư không đủ để chuyển tiền!");
        } else if (amount > 0) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Chuyển thành công " + amount + " từ " + accountNumber + " đến " + recipient.accountNumber);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ!");
        }
    }

    public void display() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.println("Số dư hiện tại: " + balance);
        System.out.println("----------------------------");
    }
}
