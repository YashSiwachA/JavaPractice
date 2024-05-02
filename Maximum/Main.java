//Write a Java program to find the largest element in an array using a for loop.
package Maximum;
import java.util.Scanner;
class Maxi {
    public int maxi(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];

            }
            

        }
        return max;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        Maxi maxi = new Maxi();
        int result = maxi.maxi(arr);
        System.out.println(result);
        obj.close();

    }
}