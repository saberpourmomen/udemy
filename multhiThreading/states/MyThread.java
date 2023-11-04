package multhiThreading.states;

import java.util.Scanner;

public class MyThread extends Thread{
    public void run(){
        String input="";
        Scanner sc =new Scanner(System.in);
        do{
            input=sc.next();
            System.out.println(input);
        }while (!input.equals("exit"));
    }
}
