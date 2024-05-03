package Deque;

import java.util.*;
class MyDeque<E>{
    private LinkedList<E> deque;
    public MyDeque(){
        deque = new LinkedList<>();
    }
    public void addfirst(E e){
        deque.addFirst(e);
    }
    public void addlast(E e){
        deque.addLast(e);
    }
    public E removefirst(){
        return deque.removeFirst();
    }
    public E removelast(){
       return deque.removeLast();
    }
    public E getfirst(){
        return deque.getFirst();
    }
    public E getlast(){
        return deque.getLast();
    }
    public boolean isempty(){
        return deque.isEmpty();
    }
    public int size(){
        return deque.size();
    }
}
public class Main {
    public static void main(String[] args) {
        MyDeque<Integer> mydeque = new MyDeque<>();
        mydeque.addfirst(10);
        mydeque.addfirst(15);
        mydeque.addlast(150);
        mydeque.addfirst(1200);
        mydeque.getfirst();
        mydeque.getlast();
        mydeque.removefirst();
        mydeque.removelast();
        System.out.println(mydeque.getfirst());
        System.out.println(mydeque.getlast());

    }
    
}
