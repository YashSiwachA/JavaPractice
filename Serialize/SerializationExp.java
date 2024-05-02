//Implement a Java program to serialize and deserialize an object to/from a file using ObjectOutputStream and ObjectInputStream.

package Serialize;
import java.io.*;
import java.util.Scanner;

public class SerializationExp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Age: ");
        int age = scan.nextInt();

        MyClass obj = new MyClass(name,age);
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            oos.writeObject(obj);
            oos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        scan.close();

        
    }

}
