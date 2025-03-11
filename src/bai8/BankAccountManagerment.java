package bai8;

public class BankAccountManagerment {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Nguyễn Văn A", 5000);
        BankAccount acc2 = new BankAccount("789101", "Trần Thị B", 3000);

        acc1.display();
        acc2.display();

        acc1.deposit(2000);
        acc1.display();

        acc1.withdraw(1000);
        acc1.display();

        acc1.transfer(acc2, 2500);
        acc1.display();
        acc2.display();
    }
}
