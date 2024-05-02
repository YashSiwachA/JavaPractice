package BufferedWriter;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt")); ){
            writer.write("Hello Java\n");
            writer.write("I am Yash.!!!!");
            writer.close();
        

        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
