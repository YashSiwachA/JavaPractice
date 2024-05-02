//Implement a Java program to sort an arrayList of strings in ascending order using the Collections.sort() method.

package ArrayListSort;
import java.util.*;
class GenericArray<T>{
    int max = 15;
    private T[] array;
    int size;
    @SuppressWarnings("unchecked")
    GenericArray(){
        array = (T[]) new Object[max];
        size = 0;
    }
    public void add(T obj){
        if(size<max){
            array[size] = obj;
            size++;
        }
        else{
            System.out.println("Can't add");
        }
        
    }
    public T remover(){
        T item = array[size-1];
        array[size-1] = null;
        size--;
        return item; 

    }
    public void diplay(){
        if(size!=0){
            for(int i = 0;i<array.length;i++){
                if(array[i]!=null){
                    System.out.println(array[i]);
                }
            }
        }
    }
    public void give(){

        System.out.println(size);
        T[] arr = Arrays.copyOf(array, size);
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    
    
}
public class Main {
    public static void main(String[] args) {
        
            final GenericArray<String> array = new GenericArray<>();
            array.add("A");
            array.add("C");
            array.add("B");
            array.add("b");
            array.add("a");
            
            array.add("c");
            array.diplay();
            array.give();
            

            // array.remover();
            // array.diplay();
        
    }

    
}
