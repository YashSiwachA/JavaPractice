package GenericClass;

class Object<T>{
    private T object;
    public Object(){

    }
    public Object(T object){
        this.object = object;
    }
    public T getObject(){
        return object;
    }
    public void setObject(T object){
        this.object = object;
    }

}
public class Main {
    public static void main(String[] args) {
        Object<Integer> intObject = new Object<>();
        intObject.setObject(10);
        System.out.println(intObject.getObject());
        
        Object<String> stringObject = new Object<>("Yash");
        System.out.println(stringObject.getObject());
        
        
    }
}
