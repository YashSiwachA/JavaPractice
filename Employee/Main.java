//Overriding toString() and equals(): 
//Create a class Employee with attributes name and id. Override the toString() method to return a string 
//representation of an employee object. Override the equals() method to check if two employee objects have the same id.
package Employee;
import java.util.Scanner;

class Employee{
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;

    }
    public String toString(){
        return "The name is "+ this.name; 
    }
    public boolean equals(Employee em){
        return (this.id == em.id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter id 1 :");
        int id1 = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter name 1 :");
        String name1 = obj.nextLine();
        Employee em1 = new Employee(name1, id1);
        System.out.println("Enter id 2 : ");
        int id2 = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter name 2 :");
        String name2 = obj.nextLine();
        Employee em2 = new Employee(name2, id2);
        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em1.equals(em2));
        obj.close();


        
    }
    
}
