//Implementing Threads using Lambda Expressions: Create a thread using lambda expression to print numbers from 1 to 10 with a delay of 1 second between each number.
package Threads;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for(int i = 0;i<10;i++){
                System.out.println(i+1);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        });
    
        thread.start();
        
        
    }

    
}
