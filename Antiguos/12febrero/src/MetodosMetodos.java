import java.io.IOException;

public class MetodosMetodos {
    static void interior() throws MiMarcada {
        throw new MiMarcada("Muy Adentro");
    }

    static void mediano() throws MiMarcada {
        interior();
    }
    public static void main(String[] args) {
        try {
            mediano();
        } catch (MiMarcada  we) {
            we.printStackTrace();
            System.out.println(we.getMessage());
        }
    }
}
