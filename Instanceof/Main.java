package Instanceof;

class Car{}
class Scorpio extends Car{}
public class Main {
    public static void main(String[] args) {
        
    
    Car Mahindra = new Car();
    Scorpio s11 = new Scorpio();
    Car car = new Car();

    System.out.println( Mahindra instanceof Car);
    System.out.println(s11 instanceof Scorpio);
    System.out.println( car instanceof Scorpio);
    }
}
