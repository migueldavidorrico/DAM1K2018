package es.orrico.miguel.primerboletin.ej6;

import java.util.ArrayList;

/**
 * Created by Miguel-David Orrico Teruel on 02/03/2018.
 */
class Padre {
    private final int numero;
    public Padre(int numero) {
        this.numero = numero;
    }
    public int suma() {
        return numero + 1;
    }
    public int getNumero() {
        return numero;
    }
}
class Hijo extends Padre {
    public Hijo(int numero) {
        super(numero);
    }
    @Override
    public int suma() {
        return super.suma() + 1;
    }
    public int resta() {
        return getNumero() - 1;
    }
}
public class Ej6 {
    public static void main(String[] args) {
//        Padre p1 = new Padre(2);
//        Padre p2 = new Hijo(2);
////        Hijo h1 = new Padre(2);
//        Hijo h2 = new Hijo(2);
//        System.out.println("p1.suma():" + p1.suma());
//        System.out.println("p2.suma():" + p2.suma());
////        System.out.println("h1.suma():" + h1.suma());
//        System.out.println("h2.suma():" + h2.suma());
//
//        //Ejercicio 7
//        Hijo h = new Hijo(2);
//        Padre p = new Hijo(2);
//        System.out.println("h.resta():" + h.resta());
//        System.out.println("p.resta():" + ((Hijo)p).resta());

//        //Ejercicio 8
//        ArrayList<Padre> personas = new ArrayList<Padre>();
//        Hijo h = new Hijo(2);
//        Padre p = new Hijo(2);
//        personas.add(h);
//        personas.add(p);
//        personas.add(new Padre(2));
//        personas.add(new Hijo(2));
//        for(Padre persona: personas) {
//            System.out.println("suma:" + persona.suma());
//        }

        //Ejercicio 9
        ArrayList<Padre> personas = new ArrayList<Padre>();
        Padre p = new Hijo(2);
        personas.add(p);
        personas.add(new Padre(2));
        personas.add(new Hijo(2));
// TODO: mostrar la "resta" de cada uno de los objetos de
// clase Hijo en el ArrayList
        for(Padre persona: personas) {
//            System.out.println("resta:" + persona.resta());
        }
    }
}
