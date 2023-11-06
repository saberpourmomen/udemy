package multhiThreading.interThreadCommunication;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private String message;
    private final Map<Student,Boolean> numberOfStudent=new HashMap<>();

    synchronized public void attendance(Student student){
        numberOfStudent.put(student,true);
    }

    synchronized public void setMessage(String message) throws InterruptedException {
        while (!checkStudentStatus()){
            wait();
        }
        this.message = message;
        numberOfStudent.entrySet().forEach(entry ->entry.setValue(false));
        notifyAll();
    }
    synchronized public String getMessage(Student student) throws InterruptedException {
        String x;
        while (numberOfStudent.get(student)){
            wait();
        }
        x=this.message;
        numberOfStudent.put(student,true);
        notifyAll();
        return x;
    }

    synchronized private boolean checkStudentStatus(){
        boolean result=true;
        for (Boolean value:this.numberOfStudent.values()) {
            result=result&&value;
        }
        return result;
    }


}
