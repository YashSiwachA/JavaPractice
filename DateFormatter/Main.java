package DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        
    
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String fd = date.format(dtf);
    System.out.println(fd);
    }
}
