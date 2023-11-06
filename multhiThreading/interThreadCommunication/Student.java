package multhiThreading.interThreadCommunication;

public class Student extends Thread{

    private final Board data;
    private final String name;
    public Student(Board data,String name){
        this.data=data;
        this.name=name;
        this.data.attendance(this);
    }
    public void run(){
        int counter=0;
        while(counter<3){
            try {
                System.out.println(this.name+" reads value :"+data.getMessage(this));
                counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
