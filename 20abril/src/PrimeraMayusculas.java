import java.io.*;

public class PrimeraMayusculas {
    public static void main(String[] args) throws IOException {
        File f = File.createTempFile("tmp", "mio", null);
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        f.deleteOnExit();

        try (
                BufferedReader br = new BufferedReader(new FileReader("poesia.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter(f))
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.substring(0, 1).toUpperCase() + linea.substring(1);
                bw.write(linea);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        f.renameTo(new File("poesia.txt"));
    }
}
