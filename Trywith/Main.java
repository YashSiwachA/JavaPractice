//Write a Java program to demonstrate the usage of try-with-resources to automatically close resources.

package Trywith;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner obj  = new Scanner(System.in);){
            
            String name = obj.nextLine();
            System.out.println(name);
        }
        catch(Exception e){
            System.out.println("Not!!!");
        }
    }   
}
