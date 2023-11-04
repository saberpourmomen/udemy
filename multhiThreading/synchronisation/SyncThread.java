package multhiThreading.synchronisation;

public class SyncThread extends Thread {
    private final ATM atm;
    private final String name;
    private final int balance;
    private final int amount;
    public SyncThread(ATM atm, String name, int balance, int amount) {
        this.atm = atm;
        this.name = name;
        this.balance = balance;
        this.amount = amount;

    }

    public void run() {
        this.atm.getCustomer().setName(this.name);
        this.atm.getCustomer().setBalance(this.balance);
        if (this.amount > 0) {
            atm.deposit(this.amount);
        } else {
            atm.withdrawal(this.amount);
        }
    }
}
