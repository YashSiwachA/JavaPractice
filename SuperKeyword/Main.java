package SuperKeyword;
// Main.java

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Calling superclass constructor
        
    }
    public void display(){
    System.out.println(name);
}
}

public class Main {
    
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.display();
        
    }
}
