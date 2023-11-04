package multhiThreading.synchronisation;

public class ATM {

    private final Customer customer;

    public ATM(){
        this.customer=new Customer();
    }
    synchronized public int checkBalance(){

        return this.customer.getBalance();
   }
    synchronized public void deposit(int amount){
        this.customer.setBalance(this.customer.getBalance()+amount);
        System.out.printf("%s %d $ %s %s  account, transaction successful!\n",(amount>0)?"Deposit ":"Withdrawal ",Math.abs(amount),(amount>0)?" to ":" from ",this.customer.getName());
        syncDisplay();
    }
    synchronized public void withdrawal(int amount){
        if (Math.abs(amount)>this.customer.getBalance()){
            System.out.printf("Withdrawal %d $ from %s  account, transaction failed!\nNot enough money\n",Math.abs(amount),this.customer.getName());
            syncDisplay();
        }
        else{
            deposit(amount);
        }

    }
    synchronized private void syncDisplay(){
        System.out.println("the balance of "+this.customer.getName() + " : "+this.customer.getBalance());
    }

    synchronized public Customer getCustomer() {
        return customer;
    }
}
