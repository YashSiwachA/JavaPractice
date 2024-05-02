package Superclass;
import java.util.Scanner;

class Superclass {
    void display(int a){
        System.out.println("From superclass: "+a);
    }
    public class Subclass extends Superclass {
        void display(int a){
            System.out.println("From subclass: " + 2*a);
        }
    
        
    }

}
public class Main {
    
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        Superclass superc = new Superclass();
        Superclass.Subclass sub = superc.new Subclass(); 
        superc.display(a);
        sub.display(a);
        obj.close();

    }
}
