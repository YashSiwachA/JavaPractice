package Calculator;
import java.util.Scanner;
import java.lang.ArithmeticException;
class Calculator{
    double a;
    double b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;

    }
    
    public void add(){
        System.out.printf("%,.2f",a+b);
    }
    public void subtraction(){
        System.out.printf("%,.2f",a-b);
    }
    public void multiply(){
        System.out.printf("%,.2f",a*b);
    }
    
    public void divide(){
        System.out.printf("%,.2f",a/b);
    }
    

}
public class Main {
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in); ){
            System.out.print("Enter 1st number: ");
            int a = obj.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = obj.nextInt();
            System.out.println("Enter your choice Operation:\n1 for Addition\n2 for Subract.\n3 for Multiplication\n4 for Division.");
            int c= obj.nextInt();
            Calculator calci = new Calculator(a, b);
            switch (c) {
                case 1:
                    calci.add();
                    break;
                case 2:
                    calci.subtraction();
                    break;
                case 3:
                    calci.multiply();
                    break;
                case 4:
                    calci.divide();
                    break;
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }

        }
        catch(ArithmeticException e){
            System.out.println("Cant Divide by Zero!!!\n Don't Even Try!!!!");
        }
    }
    
}
