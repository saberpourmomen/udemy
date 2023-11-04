package multhiThreading.synchronisation;

public class Customer {
    private int balance;
    private String name;

    synchronized public int getBalance() {
        return balance;
    }

    synchronized public void setBalance(int balance) {
        this.balance = balance;
    }

    synchronized public String getName() {
        return name;
    }

    synchronized public void setName(String name) {
        this.name = name;
    }
}
