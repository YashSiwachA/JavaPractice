//Implement a Java program that takes command-line arguments and prints the sum of all the arguments.

package SumCmd;

import java.lang.NumberFormatException;
class CmdArgs {
    public int sum(int[] a){
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum += a[i];
        }
        return sum;

    }

}
public class Main{
    public static void main(String[] args){
        
        try{
        int[] arr = new int[args.length];
        for(int i = 0;i<args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        
        }
        CmdArgs cd = new CmdArgs();
        int result = cd.sum(arr);
        System.out.println(result);

        }catch(NumberFormatException e){
            System.out.println("Invalid number");
        }
    }
}