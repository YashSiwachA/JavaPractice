package Rectangle;
import java.util.Scanner;
class Rectangle {
    double length,width;
    Rectangle(double len , double wid){
        this.length = len;
        this.width = wid;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    
        
}
public class Main {
    public static void main(String[] args) {
        double len,wid;
        Scanner obj = new Scanner(System.in);
        len = obj.nextDouble();
        wid = obj.nextDouble();
        obj.nextLine();
        Rectangle r = new Rectangle(len, wid);
        System.out.println("Enter Your Choice 0 or Perimeter and 1 or Area");
        int choice = obj.nextInt();

        if(choice==1){
            System.out.printf("%,.2f",r.area());
        }
        else if(choice==0){
            System.out.printf("%,.2f", r.perimeter());
        }
        else{
            System.out.println("Invalid Option.");
        }
        obj.close();




    }
}
