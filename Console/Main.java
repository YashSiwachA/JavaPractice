//Develop a Java application that reads a string from the console and prints its reverse.
import java.util.Scanner;
class Console{
    public String reverse(String a){
        String temp = "";
        for(int i =0;i<a.length();i++){
            temp = a.charAt(i)+ temp;
        }
        return temp;

    }
}
class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a = obj.nextLine();
        Console c = new Console();
        System.out.println(c.reverse(a));
        obj.close();

        
    }
}