import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class Pieza implements Comparable {
    piezas pieza;
    String color;

    @Override
    public int compareTo(Object o) {
        Pieza otra = (Pieza) o;
        if (this.pieza == piezas.REY) {
            return -999;
        }
        if (this.pieza == piezas.PEON) {
            return 8888;
        }
        return 0;
    }
}
