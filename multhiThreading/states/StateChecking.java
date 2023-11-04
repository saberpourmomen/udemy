package multhiThreading.states;

public class StateChecking {
    public static void main(String[] args) throws Exception {
        MyThread thread=new MyThread();
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
    }

}
