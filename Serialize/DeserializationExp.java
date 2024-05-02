package Serialize;
import java.io.*;
public class DeserializationExp{
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
            MyClass obj = (MyClass) ois.readObject();
            ois.close();
            System.out.println("Name: "+ obj.getName());
            System.out.println("Age: " + obj.getAge());

        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}