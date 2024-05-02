package Serialize;
import java.io.*;

public class MyClass implements Serializable{
    private int age;
    private String name;
    MyClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}