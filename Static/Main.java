package Static;

class Static{
    static int a=0;
    Static(){
        a++;
    }
    public void display(){
        System.out.println(a);
    }
    
}
public class Main {
    public static void main(String[] args) {
        
    
    Static s = new Static();
    s.display();
    Static t = new Static();
    t.display();
    Static c = new Static();
    c.display();


    }


    
}
