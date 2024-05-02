//Using Lambda Expressions: Write a program to sort a list of strings in ascending order using lambda expressions.

package LamdaExpression;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in); 
         
         int n = obj.nextInt();
         obj.nextLine();
         ArrayList<String> str = new ArrayList<>();
         System.out.println("Enter the Strings: ");
         for(int i = 0;i<n;i++){
            str.add(obj.nextLine());
         }
         Collections.sort(str ,(s1,s2) -> s1.compareTo(s2));
         for(String s: str){
            System.out.print(s + " ");
         }
         obj.close();


         
         
         
         
         
         
    }
    
}
