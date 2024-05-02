package Overloading;
import java.util.Scanner;
class Overloading {
    public int number(int number){
        return number;
    }
    public String number(String number){
        return number;
    }
    public double number(double number){
        return number;
    }
    
}

public class Main{
    public static void main(String[] args) {
    int a;
    String b;
    double c;
    Scanner obj = new Scanner(System.in);
    Overloading over = new Overloading();
    System.out.println("Enter 0 for Int , 1 for String and 2 for Double:");
    int choice = obj.nextInt();
    obj.nextLine();
    if(choice==0){
        System.out.println("Enter Int:");
        a = obj.nextInt();
        System.out.println(over.number(a));
    }
    else if(choice == 1){
        System.out.println("Enter String:");
        b = obj.nextLine();
        System.out.println(over.number(b));
    }
    else if(choice==2){
        System.out.println("Enter Double");
        c = obj.nextDouble();
        System.out.printf("%,.2f",over.number(c));
    }
    obj.close();

    }

}
