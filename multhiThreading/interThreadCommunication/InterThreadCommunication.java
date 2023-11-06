package multhiThreading.interThreadCommunication;

public class InterThreadCommunication {
    public static void main(String[] args) {
        Board data=new Board();
        Teacher teacher =new Teacher(data);
        Student student1 =new Student(data,"student1");
        Student student2 =new Student(data,"student2");
        Student student3 =new Student(data,"student3");
        teacher.start();
        student1.start();
        student2.start();
        student3.start();
    }
}
