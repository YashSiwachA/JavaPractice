package TreeSet;

import java.util.*;
class Person implements Comparable<Person>{
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int compareTo(Person other){
        return Integer.compare(this.age, other.age);
    }
    public String toString(){
        return name+" - " + age;
    }
    public String getName(){
        return name;
    }

}
public class Main {
    public static void main(String[] args) {
        TreeSet<Person> personsbyAge = new TreeSet<>();
        personsbyAge.add(new Person("Yash", 18));
        personsbyAge.add(new Person("Aryan", 17));
        personsbyAge.add(new Person( "YA", 19));
        System.out.println("Persons by Age: ");
        for(Person p : personsbyAge){
            System.out.println(p);
        }
        TreeSet<Person> personsbyName = new TreeSet<>(Comparator.comparing(Person::getName));
        personsbyName.add(new Person("Yash", 18));
        personsbyName.add(new Person("Aryan", 17));
        personsbyName.add(new Person( "YA", 19));
        for(Person p : personsbyName){
            System.out.println(p);
        }
        
    }
    
}
