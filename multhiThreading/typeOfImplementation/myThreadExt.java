package multhiThreading.typeOfImplementation;

public class myThreadExt extends Thread{
    @Override
    public void run(){
        int counter=0;
        while (counter<50) {
            System.out.println("Hello myThreadExt!");
            counter++;
        }
    }
}
