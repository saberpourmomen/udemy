package multhiThreading.synchronisation;

public class SynchronisationMain {
    public static void main(String[] args) {
            ATM atm=new ATM();
    SyncThread thread1=new SyncThread(atm,"Jake",500,100);
    SyncThread thread2=new SyncThread(atm,"Samuel",1000,-100);
    SyncThread thread3=new SyncThread(atm,"John",100,-500);
    thread1.start();
    thread2.start();
    thread3.start();
    }
}
