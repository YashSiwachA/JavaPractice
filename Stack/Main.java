//Develop a Java program to create a custom generic class for a stack data structure with push and pop operations.

package Stack;
import java.util.EmptyStackException;
class Stack<T>{
    int max =  5;
    private T[] array;
    private int size;
    @SuppressWarnings("unchecked")
    public Stack(){
        this.array =(T[]) new Object[max];
        size = 0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void push(T obj){
        if(size<max){
        array[size]=obj;
        size++;
        }
        else{
            System.out.println("Stack Overload!!!!");
        }
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T item = array[size-1];
        array[--size] = null;
        return item;
    }
    public void diplay(){
        if(!isEmpty()){
        for(int i=0;i<array.length;i++){
            if(array[i]!= null){
            System.out.println(array[i]+" ");}
            
        }
    }
        else{
            System.out.println("Stack is Empty!!!!");
        }
    
    }
}
    


public class Main {
    public static void main(String[] args) {
        
    
    try{
        Stack<Integer> stack = new Stack<>();

        stack.diplay();
        // stack.push(10);
        // stack.push(50);
        // stack.push(850);
        // stack.push(10);
        // stack.push(50);
        // stack.push(850);
        // stack.push(10);
        // stack.push(50);
        // stack.push(850);
        // stack.push(10);
        // stack.push(50);
        // stack.push(850);
        // stack.push(10);
        // stack.push(50);
        // stack.push(850);
        // stack.diplay();

    }
    catch(EmptyStackException e){
        System.out.println("Can't do that my friend!!!!");
    }
}

    
}
