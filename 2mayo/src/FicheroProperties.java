import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class FicheroProperties {
    public static void main(String[] args) throws FileNotFoundException {
        Properties preferences = new Properties();
        preferences.put("Name", "Harry Hacker");
        preferences.put("Color", "Purple");
        preferences.put("Font", "18 pt Troglodyte Bold");
        String font = preferences.getProperty("Font");

        FileOutputStream out = new FileOutputStream("myProg.ini");
        preferences.save(out, "Preferences");
    }
}
