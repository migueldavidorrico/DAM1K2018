import java.util.Arrays;

/*

Dado un array de Productos (ID, Descripción, Precio en euros enteros)

Hacer las siguientes operaciones:

Mostrar (obtener) los productos más caros que un precio dado
Rebajar los productos más caros que un precio dado un tanto por ciento dado

(Black Friday: Todo lo que supere 200 €, lo rebajamos un 20%)
Mostrar los productos ordenados por ID, por precio y por Descripción
(por precio ascendente y descendente)
 */
public class Principal {

    public static void rebajaProductos(int rebaja, Producto[] lista) {
        for (Producto p :
                lista) {
            p.setPrecio(p.getPrecio() * (100 - rebaja) / 100);
        }
    }

    public static Producto[] productosMasCarosDe(int precio, Producto[] lista) {
        Producto[] salida = new Producto[lista.length];
        int indiceInsercion = 0;
        for (Producto p :
                lista) {
            if (p.getPrecio() > precio) {
                salida[indiceInsercion++] = p;
            }
        }
        return Arrays.copyOf(salida, indiceInsercion);
    }

    public static void imprimeLista(Producto[] lista) {
        System.out.println("\nLISTA DE PRODUCTOS\n-------------------");
        for (Producto p :
                lista) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Producto[] lista = {
                new Producto(23, "RUEDA SECA", 300),
                new Producto(45, "RUEDA MOJADA", 500),
                new Producto(76, "RUEDA NIEVE", 1000),
                new Producto(87, "RUEDINES", 70),
                new Producto(10, "PARCHE RUEDA", 3),
                new Producto(32, "KIT DE REPARACIÓN", 4500)
        };
//        imprimeLista(lista);
//        Producto[] caros=productosMasCarosDe(100,lista);
//        imprimeLista(caros);
//        caros[0].setPrecio(10000);
//        imprimeLista(lista);
//        rebajaProductos(15,caros);
//        imprimeLista(lista);
//
        rebajaProductos(2, productosMasCarosDe(300, lista));
        imprimeLista(lista);
        ordenaPorID(lista);
        imprimeLista(lista);
        ordenaPorDescripcion(lista);
        imprimeLista(lista);
        ordenaPorPrecioASC(lista);
        imprimeLista(lista);
        ordenaPorPrecioDESC(lista);
        imprimeLista(lista);
        //Los n(tres, por ejemplo) productos que menos dinero cuestan
        ordenaPorPrecioASC(lista);
        imprimeLista(Arrays.copyOf(lista,3));
    }

    private static void ordenaPorID(Producto[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            int posMinimo = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[j].getID() < lista[posMinimo].getID()) {
                    posMinimo = j;
                }
            }
            System.out.println(posMinimo);
            if (posMinimo != i) {
                swap(lista, i, posMinimo);
            }
        }
    }
    private static void ordenaPorPrecioASC(Producto[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            int posMinimo = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[j].getPrecio() < lista[posMinimo].getPrecio()) {
                    posMinimo = j;
                }
            }
            System.out.println(posMinimo);
            if (posMinimo != i) {
                swap(lista, i, posMinimo);
            }
        }
    }
    private static void ordenaPorPrecioDESC(Producto[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            int posMinimo = i;
            for (int j = i; j < lista.length; j++) {
                if (lista[j].getPrecio() > lista[posMinimo].getPrecio()) {
                    posMinimo = j;
                }
            }
            System.out.println(posMinimo);
            if (posMinimo != i) {
                swap(lista, i, posMinimo);
            }
        }
    }

    private static void swap(Producto[] lista, int i, int posMinimo) {
        Producto aux = lista[i];
        lista[i] = lista[posMinimo];
        lista[posMinimo] = aux;
    }

    private static void ordenaPorDescripcion(Producto[] lista) {
        for (int i = 0; i < lista.length - 1; i++) {
            int posMinimo = getPosMinimo(lista, i);
            if (posMinimo != i) {
                swap(lista, i, posMinimo);
            }
        }
    }


    private static int getPosMinimo(Producto[] lista, int i) {
        int posMinimo = i;
        for (int j = i; j < lista.length; j++) {
            if (lista[j].getDescripcion().compareTo(lista[posMinimo].getDescripcion()) < 0) {
                posMinimo = j;
            }
        }
        return posMinimo;
    }
}
