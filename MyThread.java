package mythread;

public class MyThread extends Thread {
    
    public MyThread (String name){
        super (name);
    }
    
    public void run (){
 
        for (int i = 0; i < 4; i++){
        
            System.out.println(getName() + " " + i);
            try {
                sleep (400);
            }
            catch (InterruptedException e){}
        }
    }
    
    public static void main(String[] args) {
        
        MyThread t1 = new MyThread ("Read");
        MyThread t2 = new MyThread ("Write");
        
        t1.start();
        t2.start();
    }
}