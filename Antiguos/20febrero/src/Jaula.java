class Animal implements Comparable<Animal>{
    int edad;
    public Animal(int edad) {this.edad = edad;}

    @Override
    public int compareTo(Animal o) {
        return this.edad-o.edad;
    }
}
class Mamifero extends Animal {
    public Mamifero(int edad){
        super(edad);
    }
}
class Leon extends Mamifero {
    public Leon(int edad){super(edad);}
}
class Cocodrilo extends Mamifero{
    public Cocodrilo(int edad){super(edad);}
}
class Jaula implements Comparable<Jaula>{
    public Animal animal;
    public void encerrar(Animal animal){
        this.animal = animal;
    }
    public static void main(String args[]){
        Jaula j = new Jaula();
        j.encerrar(new Cocodrilo(25));
    }

    @Override
    public int compareTo(Jaula o) {
        return this.animal.compareTo(o.animal);
    }
}

