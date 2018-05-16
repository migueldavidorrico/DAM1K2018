import java.io.*;

public class EjemploDatos {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("oo.dat")))) {
            dos.writeUTF("Ana");
            dos.writeUTF("López");
            dos.writeInt(45);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
