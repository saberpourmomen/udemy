package multhiThreading.typeOfImplementation;

public class ThreadCreationExample {
    public static void main(String[] args) {
        myThreadExt myThreadExt=new myThreadExt();
        myThreadExt.start();
        //-----------------------------------------
        myThreadImpl myThread=new myThreadImpl();
        Thread thread=new Thread(myThread);
        thread.start();
    }
}
