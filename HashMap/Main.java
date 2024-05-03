package HashMap;

import java.util.*;
class Entry<K,V>{
    K key;
    V value;
    public Entry(K key , V value){
        this.key = key;
        this.value = value;
    }


}
@SuppressWarnings("unchecked")
class Myhash<K, V> {
    private List<Entry<K,V>>[] buckets;
    private static final int  max = 15;
    
    public Myhash(){
        buckets = new  ArrayList[max];
        for(int i=0;i<max;i++){
            buckets[i] =new ArrayList<>();
        }
    }
    public void put(K key , V value){
        int index = Math.abs(key.hashCode()) % max;
        List<Entry<K,V>> bucket = buckets[index];
        for(Entry<K,V> entry:  bucket){

            if(entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        bucket.add(new Entry<>(key,value));
    }
    public V get(K key){
        int index = Math.abs(key.hashCode())% max;
        List<Entry<K,V>> bucket = buckets[index];
        for(Entry<K,V> entry:bucket){
            if(entry.key.equals(key)){
            return entry.value;
        }
        }
    
    return null;
} 
} 
public class Main {

     public static void main(String[] args) {
        Myhash<String ,Integer> myhash = new Myhash<>();
        myhash.put("Yash", 18);
        myhash.put("Aryan", 19);
        myhash.put("YA", 20);
        System.out.println(myhash.get("YA"));
        System.out.println(myhash.get("Yash"));



     }
}

