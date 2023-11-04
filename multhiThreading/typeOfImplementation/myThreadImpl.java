package multhiThreading.typeOfImplementation;

public class myThreadImpl implements Runnable{
    @Override
    public void run() {
        int counter=0;
        while (counter<50) {
            System.out.println("Hello myThreadImpl!");
            counter++;
        }
    }
}
