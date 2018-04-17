import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Imagen {
    public static void main(String[] args) throws IOException {
        byte[] imagen = Files.readAllBytes(Paths.get("catedral.bmp"));
        byte[] rojo = new byte[imagen.length];
        byte[] verde = new byte[imagen.length];
        byte[] azul = new byte[imagen.length];
        byte[] blur = new byte[imagen.length];
        byte[] gris = new byte[imagen.length];

        for (int i = 0; i < 54; i++) {
            rojo[i] = imagen[i];
            verde[i] = imagen[i];
            azul[i] = imagen[i];
            blur[i] = imagen[i];
            gris[i] = imagen[i];
        }
        for (int i = 54; i < imagen.length - 3; i += 3) {
            rojo[i] = imagen[i];
            verde[i + 1] = imagen[i + 1];
            azul[i + 2] = imagen[i + 2];
            gris[i] = (byte) ((imagen[i] + imagen[i + 1] + imagen[i + 2]) / 3);
            gris[i + 1] = (byte) ((imagen[i] + imagen[i + 1] + imagen[i + 2]) / 3);
            gris[i + 2] = (byte) ((imagen[i] + imagen[i + 1] + imagen[i + 2]) / 3);
        }
        for (int i = 54; i < imagen.length - 9; i++) {
            blur[i] = (byte) ((imagen[i] + imagen[i + 3] + imagen[i + 6]) / 3);
            blur[i + 1] = (byte) ((imagen[i + 1] + imagen[i + 4] + imagen[i + 7]) / 3);
            blur[i + 2] = (byte) ((imagen[i + 2] + imagen[i + 5] + imagen[i + 8]) / 3);
        }

        Files.write(Paths.get("catedralroja.bmp"), rojo, StandardOpenOption.CREATE);
        Files.write(Paths.get("catedralazul.bmp"), azul, StandardOpenOption.CREATE);
        Files.write(Paths.get("catedralverde.bmp"), verde, StandardOpenOption.CREATE);
        Files.write(Paths.get("catedralblur.bmp"), blur, StandardOpenOption.CREATE);
        Files.write(Paths.get("catedralgris.bmp"), gris, StandardOpenOption.CREATE);

    }
}
