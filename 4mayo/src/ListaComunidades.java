import java.io.*;
import java.util.*;

public class ListaComunidades implements Serializable {
    List<ComunidadAutonoma> comunidades;

    public ListaComunidades() {
        this.comunidades = new ArrayList<>();
    }

    public void anyadeComunidad(ComunidadAutonoma c) {
        this.comunidades.add(c);
    }

    @Override
    public String toString() {
        String salida = "LISTA DE COMUNIDADES DE ESPAÑA\n";
        for (ComunidadAutonoma c :
                this.comunidades) {
            salida += "    " + c + "\n";
        }
        return salida;
    }

    public static void main(String[] args) {
        ListaComunidades milista = new ListaComunidades();
//        ComunidadAutonoma castillaLeon=new ComunidadAutonoma(
//                "Castilla - León",
//                "Valladolid",
//                30_000,
//                false
//        );
//        castillaLeon.anyadeProvincia(new Provincia("Burgos"));
//        castillaLeon.anyadeProvincia(new Provincia("Ávila"));
//        castillaLeon.anyadeProvincia(new Provincia("León"));
//        castillaLeon.anyadeProvincia(new Provincia("Palencia"));
//        castillaLeon.anyadeProvincia(new Provincia("Zamora"));
//        castillaLeon.anyadeProvincia(new Provincia("Soria"));
//        castillaLeon.anyadeProvincia(new Provincia("Valladolid"));
//        castillaLeon.anyadeProvincia(new Provincia("Segovia"));
//        castillaLeon.anyadeProvincia(new Provincia("Salamanca"));
//        ComunidadAutonoma comunidadValenciana=new ComunidadAutonoma(
//                "Comunidad Valenciana",
//                "Valencia",
//                500_000,
//                true
//        );
//        comunidadValenciana.anyadeProvincia(new Provincia("Alicante","Alicante"));
//        comunidadValenciana.anyadeProvincia(new Provincia("Valencia","Valencia"));
//        comunidadValenciana.anyadeProvincia(new Provincia("Castellón","Castellón"));
//        ComunidadAutonoma murcia=new ComunidadAutonoma(
//                "Murcia",
//                "Murcia",
//                1_000_000,
//                true
//        );
//        murcia.anyadeProvincia(new Provincia("Murcia","Murcia"));
//        ComunidadAutonoma paisVasco=new ComunidadAutonoma(
//                "Pais Vasco",
//                "Bilbao",
//                3_000_000,
//                true
//        );
//        paisVasco.anyadeProvincia(new Provincia("Alava","Vitoria"));
//        paisVasco.anyadeProvincia(new Provincia("Guipuzcoa","San Sebastian"));
//        paisVasco.anyadeProvincia(new Provincia("Vizcaya","Bilbao"));
//        milista.anyadeComunidad(paisVasco);
//        milista.anyadeComunidad(murcia);
//        milista.anyadeComunidad(comunidadValenciana);
//        milista.anyadeComunidad(castillaLeon);
//
//        System.out.println(milista);
//        escribeFicheroObjetos(milista);
//        System.out.println(milista);
//        escribeFicheroTexto(milista);
//        escribeAleatorio(milista);
        milista = leeDeAleatorio();
        System.out.println(milista);
    }

    private static ListaComunidades leeDeAleatorio() {
        File fichero = new File("com.dat");
        ListaComunidades salida = new ListaComunidades();
        int posicionRegistro = 0;
        try (RandomAccessFile raf = new RandomAccessFile(fichero, "r")) {
            int posicionActual = 0;
            while (posicionActual < raf.length()) {
                posicionActual = 1055 * posicionRegistro;
                raf.seek(posicionActual);
                System.out.println(posicionActual);
                String nombreC = raf.readUTF();
                System.out.println(nombreC);
                raf.seek(posicionActual + 30);
                String capitalC = raf.readUTF();
                raf.seek(posicionActual + 30 + 20);
                ComunidadAutonoma c = new ComunidadAutonoma(
                        nombreC,
                        capitalC,
                        raf.readInt(),
                        raf.readBoolean()

                );
                long punteroInicioProvincias = raf.getFilePointer();
                System.out.println(punteroInicioProvincias);
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                    raf.seek(punteroInicioProvincias + i * 50);
                    String nombreP = raf.readUTF();
                    raf.seek(punteroInicioProvincias + i * 50 + 30);
                    String capitalP = raf.readUTF();
                    if (!"".equals(nombreP)) {
                        c.anyadeProvincia(new Provincia(nombreP, capitalP));
                    }
                }
                salida.anyadeComunidad(c);
                posicionRegistro++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Fin de fichero alcanzado");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salida;
    }

    private static void escribeAleatorio(ListaComunidades milista) {
        File fichero = new File("com.dat");
        try (RandomAccessFile raf = new RandomAccessFile(fichero, "rw")) {
            for (int i = 0; i < milista.comunidades.size(); i++) {


                ComunidadAutonoma c = milista.comunidades.get(i);
                raf.seek(i * 1055);
                raf.writeUTF(c.getNombre());
                raf.seek(i * 1055 + 30);
                raf.writeUTF(c.getCapital());
                raf.seek(i * 1055 + 30 + 20);
                raf.writeInt(c.getPoblacion());
                raf.writeBoolean(c.isTieneLitoral());
                long posicionActual = raf.getFilePointer();
                for (int j = 0; j < c.getProvincias().size(); j++) {
                    raf.seek(posicionActual + j * 50);
                    raf.writeUTF(c.getProvincias().get(j).getNombre());
                    raf.seek(posicionActual + j * 50 + 30);
                    raf.writeUTF(c.getProvincias().get(j).getCapital());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ListaComunidades leeTextoFichero() {
        File fichero = new File("com.txt");
        ListaComunidades salida = new ListaComunidades();
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            ComunidadAutonoma actual;
            String linea;
            while ((linea = br.readLine()) != null) {
                if ("".equals(linea)) {
                    return salida;
                }
                actual = new ComunidadAutonoma(
                        linea,
                        br.readLine(),
                        Integer.parseInt(br.readLine()),
                        br.readLine().equals("TIENE LITORAL")
                );
                int veces = Integer.parseInt(br.readLine());
                for (int i = 0; i < veces; i++) {
                    actual.anyadeProvincia(new Provincia(
                            br.readLine(),
                            br.readLine()
                    ));
                }
                salida.anyadeComunidad(actual);
            }

            return salida;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void escribeFicheroTexto(ListaComunidades milista) {
        File fichero = new File("com.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (ComunidadAutonoma c :
                    milista.comunidades) {

                bw.write(c.cadenaFichero());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void escribeFicheroObjetos(ListaComunidades milista) {
        File fichero = new File("com.obj");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {
            oos.writeObject(milista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ListaComunidades leeFichero() {
        File fichero = new File("com.obj");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            ListaComunidades l = (ListaComunidades) ois.readObject();
            return l;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
