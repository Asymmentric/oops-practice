// This program depicts the use of multithreading

import java.util.*;

class NewThread implements Runnable{
    
    String name;
    Thread t;
    
    NewThread(String tname){
        
        name = tname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        
        t.start();
        
    }
    
    
    public void run(){
        try{
            for (int i=5;i>0 ;i-- ){
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            } 
            
        } catch(InterruptedException e){
            System.out.println(name + "Interrupted");
        }
        System.out.println("Exiting: " + name);
    }
}

public class Main {
    public static void main(String[] args)
    {
       new NewThread("One");
       new NewThread("Two");
       
       try{
           for(int i=5; i>0; i--){
               System.out.println("Main Thread: " + i);
               Thread.sleep(10000);
           }
       } catch(InterruptedException e){
           System.out.println("Main Interrupted");
       }
       
       System.out.println("Main exiting");
    }
}

