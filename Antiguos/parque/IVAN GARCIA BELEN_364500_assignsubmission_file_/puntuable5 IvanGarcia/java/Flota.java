public class Flota {
    private static final int MAXIMO_COCHES = 50;
    private Coche[] Coches = new Coche[MAXIMO_COCHES];
    private int contadorCoches = 0;

    //Inicia la array de "Coches" con 5 coches.
    public void iniciarFlota() {
        darDeAlta(new Coche("ABC-1111", Marcas.FORD, 300));
        darDeAlta(new Coche("ABC-2222", Marcas.PEGASO, 340));
        darDeAlta(new Coche("ABC-3333", Marcas.FORD, 300));
        darDeAlta(new Coche("ABC-4444", Marcas.PEGASO, 3640));
        darDeAlta(new Coche("ABC-5555", Marcas.MERCEDES, 450));
    }

    //Crea un array sin nulos a partir de la array original. Es utilizado en el método "ordenaCoches" y en "seleccionarCoche".
    public Coche[] quitarNulosDeArray() {
        Coche[] salida = new Coche[contadorCoches];
        for (int i = 0; i < salida.length; i++) {
            salida[i] = Coches[i];
            System.out.println(salida[i].salidaDatos());
        }
        return salida;
    }

    //Añade un coche a la array "Coches" y suma 1 al "contadorCoches".
    public boolean darDeAlta(Coche c) {
        if (contadorCoches == MAXIMO_COCHES) {
            return false;
        } else Coches[contadorCoches] = c;
        contadorCoches++;
        System.out.println("El contador de coche esta en: " + contadorCoches);
        return true;
    }

    //Elimina un coche de la array "Coches" y resta 1 al "contadorCoches".
    public void borrarCoche(Coche c) {
        int posicionABorrar = buscarPosicionCoche(c);
        for (int i = posicionABorrar; i < contadorCoches - 1; i++) {
            Coches[i] = Coches[i + 1];
        }
        contadorCoches--;
        System.out.println("El contador de coche esta en: " + contadorCoches);
    }

    //Recorre el array "Coches"para mostrar en pantalla todos los coches creados.
    public String listarCoches() {
        Coche[] Coches = ordenaCoches();
        String salida = "";
        if (contadorCoches >= 1) {
            salida = String.format("%20s %20s %20s %20s", "Matrícula", "Modelo", "Carga.Max", "Kilometros\n");
            System.out.println("Mostrar coches Creados\n");
            for (Coche c : Coches
                    ) {
                salida += c.salidaDatos() + "\n";
            }
        } else salida = "No hay ningún coche.";
        return salida;
    }

    //Recoge un coche a elegir de una de las posiciones de la array "Coches".
    public Coche[] seleccionarCoche() {
        Coche[] salida = ordenaCoches();
        for (int i = 0; i < contadorCoches; i++) {
            Coches[i] = salida[i];
        }
        return salida;
    }

    //Busca la posicion de la matrícula de un coche en la array "Coches" para luego usarlo en el método "borrarCoche".
    public int buscarPosicionCoche(Coche c) {
        int i;
        for (i = 0; i < contadorCoches; i++) {
            if (Coches[i].getMatricula() == c.getMatricula()) {
                return i;
            }
        }
        return i;
    }

    //Comprueba en la array de "Coches" si la matrícula que has introducido es igual a una matricula de un coche de esa array"
    public boolean comprobarMatricula(String matricula) {
        Utilidades.pasarAMayusculas(matricula);
        for (int i = 0; i < contadorCoches; i++) {
            if (matricula.equals(Coches[i].getMatricula())) {
                return false;
            }
        }
        return true;
    }

    //Comprueba si el contador esta a 0 para dar acceso o no a "DATOS y "BAJA".
    public boolean comprobarSiHayCoches() {
        boolean comprobacion = true;
        if (contadorCoches == 0) {
            comprobacion = false;
        }
        System.out.println(comprobacion);
        return comprobacion;
    }

    //Comprueba si el contador es igual a MAXIMO_COCHES para que nos prohiba o no crear más coches.
    public boolean comprobarMaximoCoches() {
        boolean comprobacion = true;
        if (contadorCoches == MAXIMO_COCHES) {
            System.out.println("Has alcanzado el límite");
            comprobacion = false;
        }
        System.out.println("Puedes agregar un coche");
        return comprobacion;
    }

    //Ordena los coches en orden alfabetico.
    private Coche[] ordenaCoches() {
        Coche auxiliar;
        Coche[] salida = quitarNulosDeArray();
        for (int i = 0; i < salida.length - 1; i++)
            for (int j = 0; j < salida.length - i - 1; j++)
                if (salida[j + 1].getMatricula().compareTo(salida[j].getMatricula()) < 0) {
                    auxiliar = salida[j + 1];
                    salida[j + 1] = salida[j];
                    salida[j] = auxiliar;
                }
        return salida;
    }
}