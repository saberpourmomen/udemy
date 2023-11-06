package multhiThreading.interThreadCommunication;

public class Teacher extends Thread{

    private final Board data;
    public Teacher(Board data){
        this.data=data;
    }
    public void run(){
        String[] messages= {"Hi guys","I'm John","Your java teacher"};
        int counter=0;
        while(counter<messages.length){
            try {
                data.setMessage(messages[counter]);
                System.out.println("Teacher writes message :"+messages[counter]);
                counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
