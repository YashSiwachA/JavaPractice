package Facto;
//Write a Java program to calculate the factorial of a number using a recursive method.
import java.util.Scanner;
class Factorial{
    public long fact;
    public long factorial(int n){
        if(n==0||n==1){
        fact = 1;}
        else{
            fact= n*factorial(n-1);
        }
        return fact;
    }
}

public class Main{
        public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        Factorial f = new Factorial();
        long result = f.factorial(a);
        System.out.println(result);
        obj.close();
    }
}