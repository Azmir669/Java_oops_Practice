
class Banking {

    private int balance;

    public Banking(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amnt) {
        balance += amnt;

    }

    public void withdraw(int amnt) {
        if (balance > 0) {
            balance -= amnt;
        } else {
            System.out.println("Insufficient funds");
        }

    }
}

public class ObjectReferenceSharing {

    public static void main(String[] args) {
        Banking shareAccount = new Banking(1000);
        Banking person1 = shareAccount;
        Banking person2 = shareAccount;
        person1.withdraw(500);
        System.out.print(person2.getBalance());

    }
}
