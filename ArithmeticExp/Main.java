package ArithmeticExp;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        try{
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = obj.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = obj.nextInt();
        System.out.println(a/b);
        obj.close();
    }catch(ArithmeticException e){
        System.out.println("Can't Divide by Zero!!!");
    }

    }
    
}
