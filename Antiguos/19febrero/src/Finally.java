import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finally {
    public static void main(String[] args) throws IOException {
        try{
            int a=0;
            int b=54;
//            System.out.println(b / a);
//            Files.readAllLines(Paths.get("noexiste.jpg"));

            return;
        } catch(ArithmeticException ae){
            System.out.println("Mal");
        }
finally {
            System.out.println("ENMTREA");
        }

    }
}
